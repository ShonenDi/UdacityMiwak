package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,colorsWords.get(i).getmAudioID());
                mediaPlayer.start();
            }
        });

    }
}
