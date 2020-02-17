package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);


        ArrayList<Word> colorsWords = new ArrayList<Word>();
        colorsWords.add(new Word("wetetti", "red"));
        colorsWords.add(new Word("chokokki", "green"));
        colorsWords.add(new Word("takaakki", "brown"));
        colorsWords.add(new Word("topoppi", "gray"));
        colorsWords.add(new Word("kululli", "black"));
        colorsWords.add(new Word("kelelli", "white"));
        colorsWords.add(new Word("topiisә", "dusty yellow"));
        colorsWords.add(new Word("chiwiitә", "mustard yellow"));

        WordAdapter itemsAdapter = new WordAdapter(this, colorsWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
