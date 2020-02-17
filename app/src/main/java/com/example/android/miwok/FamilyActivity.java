package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyMembersWords = new ArrayList<Word>();
        familyMembersWords.add(new Word("әpә", "father"));
        familyMembersWords.add(new Word("әta", "mother"));
        familyMembersWords.add(new Word("angsi", "son"));
        familyMembersWords.add(new Word("tune", "daughter"));
        familyMembersWords.add(new Word("taachi", "older brother"));
        familyMembersWords.add(new Word("chalitti", "younger brother"));
        familyMembersWords.add(new Word("tete", "older sister"));
        familyMembersWords.add(new Word("kolliti", "younger sister"));
        familyMembersWords.add(new Word("ama", "grandmother"));
        familyMembersWords.add(new Word("paapa", "grandfather"));

        WordAdapter itemsAdapter = new WordAdapter(this, familyMembersWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}

