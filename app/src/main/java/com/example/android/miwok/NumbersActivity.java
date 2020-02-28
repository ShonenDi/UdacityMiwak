package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numbersWords = new ArrayList<Word>();
        numbersWords.add(new Word("lutti", "one", R.drawable.number_one, R.raw.number_one));
        numbersWords.add(new Word("otiiko", "two", R.drawable.number_two, R.raw.number_two));
        numbersWords.add(new Word("tolookosu", "three", R.drawable.number_three, R.raw.number_three));
        numbersWords.add(new Word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        numbersWords.add(new Word("massokka", "five", R.drawable.number_five, R.raw.number_five));
        numbersWords.add(new Word("temmokka", "six", R.drawable.number_six, R.raw.number_six));
        numbersWords.add(new Word("kenekaku", "seven", R.drawable.number_seven, R.raw.number_seven));
        numbersWords.add(new Word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        numbersWords.add(new Word("wo’e", "nine", R.drawable.number_nine, R.raw.number_nine));
        numbersWords.add(new Word("na’aacha", "ten", R.drawable.number_ten, R.raw.number_ten));

        final WordAdapter itemsAdapter = new WordAdapter(this, numbersWords, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("Number Activity", "Current word is: " + numbersWords.get(i).toString());
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, numbersWords.get(i).getmAudioID());
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
