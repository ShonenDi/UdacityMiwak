package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
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

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int size = englishNumbersWords.size();
        for (int i = 0; i < size; i++) {
            TextView numbersWords = new TextView(this);
            numbersWords.setText(englishNumbersWords.get(i));
            rootView.addView(numbersWords,i);
        }
    }
}
