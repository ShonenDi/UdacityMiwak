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
        numbersWords.add(new Word("lutti","one",R.drawable.number_one));
        numbersWords.add(new Word("otiiko","two",R.drawable.number_two));
        numbersWords.add(new Word("tolookosu","three",R.drawable.number_three));
        numbersWords.add(new Word("oyyisa","four",R.drawable.number_four));
        numbersWords.add(new Word("massokka","five",R.drawable.number_five));
        numbersWords.add(new Word("temmokka","six",R.drawable.number_six));
        numbersWords.add(new Word("kenekaku","seven",R.drawable.number_seven));
        numbersWords.add(new Word("kawinta","eight",R.drawable.number_eight));
        numbersWords.add(new Word("wo’e","nine",R.drawable.number_nine));
        numbersWords.add(new Word("na’aacha","ten",R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,numbersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
