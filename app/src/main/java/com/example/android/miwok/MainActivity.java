/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find numbers TextView activity by id and set onClickListener
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // create new intent to call NumbersActivity by click
                Intent callNumbersActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(callNumbersActivity);
            }
        });
        //Find colors TextView activity by id and set onClickListener
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // create new intent to call ColorsActivity by click
                Intent callColorsActivity = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(callColorsActivity);
            }
        });
        //Find family TextView activity by id and set onClickListener
        TextView familyTextView = (TextView) findViewById(R.id.family);
        familyTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // create new intent to call FamilyActivity by click
                Intent callFamilyActivity = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(callFamilyActivity);
            }
        });
        //Find phrases TextView activity by id and set onClickListener
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // create new intent to call PhrasesActivity by click
                Intent callPhrasesActivity = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(callPhrasesActivity);
            }
        });

    }

}
