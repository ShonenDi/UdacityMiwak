package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);


        final ArrayList<Word> colorsWords = new ArrayList<Word>();
        colorsWords.add(new Word("wetetti", "red", R.drawable.color_red,R.raw.color_red));
        colorsWords.add(new Word("chokokki", "green", R.drawable.color_green,R.raw.color_green));
        colorsWords.add(new Word("takaakki", "brown", R.drawable.color_brown,R.raw.color_brown));
        colorsWords.add(new Word("topoppi", "gray", R.drawable.color_gray,R.raw.color_gray));
        colorsWords.add(new Word("kululli", "black", R.drawable.color_black,R.raw.color_black));
        colorsWords.add(new Word("kelelli", "white", R.drawable.color_white,R.raw.color_white));
        colorsWords.add(new Word("topiisә", "dusty yellow", R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorsWords.add(new Word("chiwiitә", "mustard yellow", R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        WordAdapter itemsAdapter = new WordAdapter(this, colorsWords, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("Colors Activity","Current word is: "+ colorsWords.get(i).toString());
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,colorsWords.get(i).getmAudioID());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.stop();
                        releaseMediaPlayer();
                    }
                });
            }
        });

    }

    /**
     * Clean up the media player by releasing its resources.
     */
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
        }
    }
}
