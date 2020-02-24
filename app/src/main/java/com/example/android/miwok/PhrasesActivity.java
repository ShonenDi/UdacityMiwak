package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("minto wuksus","Where are you going?"));
        phrasesWords.add(new Word("tinnә oyaase'nә","What is your name?"));
        phrasesWords.add(new Word("oyaaset...","My name is."));
        phrasesWords.add(new Word("michәksәs?","How are you feeling?"));
        phrasesWords.add(new Word("kuchi achit","I’m feeling good"));
        phrasesWords.add(new Word("әәnәs'aa?","Are you coming?"));
        phrasesWords.add(new Word("hәә’әәnәm","Yes, I’m coming."));
        phrasesWords.add(new Word("әәnәm","I’m coming."));
        phrasesWords.add(new Word("yoowutis","Let’s go."));
        phrasesWords.add(new Word("әnni'nem","Come here."));

        WordAdapter itemsAdapter = new WordAdapter(this,phrasesWords,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
