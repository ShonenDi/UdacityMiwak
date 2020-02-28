package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("minto wuksus", "Where are you going?",-1,R.raw.phrase_where_are_you_going));
        phrasesWords.add(new Word("tinnә oyaase'nә", "What is your name?",-1,R.raw.phrase_what_is_your_name));
        phrasesWords.add(new Word("oyaaset...", "My name is.",-1,R.raw.phrase_my_name_is));
        phrasesWords.add(new Word("michәksәs?", "How are you feeling?",-1,R.raw.phrase_how_are_you_feeling));
        phrasesWords.add(new Word("kuchi achit", "I’m feeling good",-1,R.raw.phrase_im_feeling_good));
        phrasesWords.add(new Word("әәnәs'aa?", "Are you coming?",-1,R.raw.phrase_are_you_coming));
        phrasesWords.add(new Word("hәә’әәnәm", "Yes, I’m coming.",-1,R.raw.phrase_yes_im_coming));
        phrasesWords.add(new Word("әәnәm", "I’m coming.",-1,R.raw.phrase_im_coming));
        phrasesWords.add(new Word("yoowutis", "Let’s go.",-1,R.raw.phrase_lets_go));
        phrasesWords.add(new Word("әnni'nem", "Come here.",-1,R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this, phrasesWords, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("Phrases Activity","Current word is: "+ phrasesWords.get(i).toString());
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, phrasesWords.get(i).getmAudioID());
                mediaPlayer.start();
            }
        });
    }
}
