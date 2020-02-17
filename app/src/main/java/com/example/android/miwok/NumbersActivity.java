package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbersWords = new ArrayList<Word>();
        numbersWords.add(new Word("lutti","one"));
        numbersWords.add(new Word("otiiko","two"));
        numbersWords.add(new Word("tolookosu","three"));
        numbersWords.add(new Word("oyyisa","four"));
        numbersWords.add(new Word("massokka","five"));
        numbersWords.add(new Word("temmokka","six"));
        numbersWords.add(new Word("kenekaku","seven"));
        numbersWords.add(new Word("kawinta","eight"));
        numbersWords.add(new Word("wo’e","nine"));
        numbersWords.add(new Word("na’aacha","ten"));

        WordAdapter itemsAdapter = new WordAdapter(this,numbersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
