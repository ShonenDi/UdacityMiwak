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

        ArrayList<String> englishNumbersWords = new ArrayList<String>();
        englishNumbersWords.add("One");
        englishNumbersWords.add("Two");
        englishNumbersWords.add("Three");
        englishNumbersWords.add("Four");
        englishNumbersWords.add("Five");
        englishNumbersWords.add("Six");
        englishNumbersWords.add("Seven");
        englishNumbersWords.add("Eight");
        englishNumbersWords.add("Nine");
        englishNumbersWords.add("Ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,englishNumbersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
