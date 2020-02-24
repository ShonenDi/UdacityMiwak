package com.example.android.miwok;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyMembersWords = new ArrayList<Word>();
        familyMembersWords.add(new Word("әpә", "father",R.drawable.family_father));
        familyMembersWords.add(new Word("әta", "mother",R.drawable.family_mother));
        familyMembersWords.add(new Word("angsi", "son",R.drawable.family_son));
        familyMembersWords.add(new Word("tune", "daughter",R.drawable.family_daughter));
        familyMembersWords.add(new Word("taachi", "older brother",R.drawable.family_older_brother));
        familyMembersWords.add(new Word("chalitti", "younger brother",R.drawable.family_younger_brother));
        familyMembersWords.add(new Word("tete", "older sister",R.drawable.family_older_sister));
        familyMembersWords.add(new Word("kolliti", "younger sister",R.drawable.family_younger_sister));
        familyMembersWords.add(new Word("ama", "grandmother",R.drawable.family_grandmother));
        familyMembersWords.add(new Word("paapa", "grandfather",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, familyMembersWords,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}

