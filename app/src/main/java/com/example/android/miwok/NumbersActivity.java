package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> englishNumbersWords = new ArrayList<Word>();
        englishNumbersWords.add(new Word("lutti","one"));
        englishNumbersWords.add(new Word("otiiko","two"));
        englishNumbersWords.add(new Word("tolookosu","three"));
        englishNumbersWords.add(new Word("oyyisa","four"));
        englishNumbersWords.add(new Word("massokka","five"));
        englishNumbersWords.add(new Word("temmokka","six"));
        englishNumbersWords.add(new Word("kenekaku","seven"));
        englishNumbersWords.add(new Word("kawinta","eight"));
        englishNumbersWords.add(new Word("wo’e","nine"));
        englishNumbersWords.add(new Word("na’aacha","ten"));

        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,R.layout.list_item,englishNumbersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
