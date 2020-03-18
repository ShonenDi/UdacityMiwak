package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesFragment extends Fragment {
    private MediaPlayer mediaPlayer;
    private AudioManager mAudioManager;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
        }
    };
    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    public PhrasesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);

        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("minto wuksus", "Where are you going?", -1, R.raw.phrase_where_are_you_going));
        phrasesWords.add(new Word("tinnә oyaase'nә", "What is your name?", -1, R.raw.phrase_what_is_your_name));
        phrasesWords.add(new Word("oyaaset...", "My name is.", -1, R.raw.phrase_my_name_is));
        phrasesWords.add(new Word("michәksәs?", "How are you feeling?", -1, R.raw.phrase_how_are_you_feeling));
        phrasesWords.add(new Word("kuchi achit", "I’m feeling good", -1, R.raw.phrase_im_feeling_good));
        phrasesWords.add(new Word("әәnәs'aa?", "Are you coming?", -1, R.raw.phrase_are_you_coming));
        phrasesWords.add(new Word("hәә’әәnәm", "Yes, I’m coming.", -1, R.raw.phrase_yes_im_coming));
        phrasesWords.add(new Word("әәnәm", "I’m coming.", -1, R.raw.phrase_im_coming));
        phrasesWords.add(new Word("yoowutis", "Let’s go.", -1, R.raw.phrase_lets_go));
        phrasesWords.add(new Word("әnni'nem", "Come here.", -1, R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), phrasesWords, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("Phrases Activity", "Current word is: " + phrasesWords.get(i).toString());
                releaseMediaPlayer();
                int result = mAudioManager.requestAudioFocus(audioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mediaPlayer = MediaPlayer.create(getActivity(), phrasesWords.get(i).getmAudioID());
                    mediaPlayer.start();
                    mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                }
            }
        });
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
            mAudioManager.abandonAudioFocus(audioFocusChangeListener);
        }
    }
}
