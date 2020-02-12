package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> englishNumbersWords = new ArrayList<Words>();
        englishNumbersWords.add(new Words("lutti","one"));
        englishNumbersWords.add(new Words("otiiko","two"));
        englishNumbersWords.add(new Words("tolookosu","three"));
        englishNumbersWords.add(new Words("oyyisa","four"));
        englishNumbersWords.add(new Words("massokka","five"));
        englishNumbersWords.add(new Words("temmokka","six"));
        englishNumbersWords.add(new Words("kenekaku","seven"));
        englishNumbersWords.add(new Words("kawinta","eight"));
        englishNumbersWords.add(new Words("wo’e","nine"));
        englishNumbersWords.add(new Words("na’aacha","ten"));


        ArrayAdapter<Words> itemsAdapter = new ArrayAdapter<Words>(this,R.layout.list_item,englishNumbersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
