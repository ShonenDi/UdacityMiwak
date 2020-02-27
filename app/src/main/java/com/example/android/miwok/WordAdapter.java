package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> arrayList) {
        super(context, 0, arrayList);

    }

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int mColorResourceId) {
        super(context, 0, objects);
        this.mColorResourceId = mColorResourceId;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        ImageView wordImage = (ImageView) listItem.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getWordImage());
            wordImage.setVisibility(View.VISIBLE);
        } else {
            wordImage.setVisibility(View.GONE);
        }

        TextView miwokWord = (TextView) listItem.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentWord.getMiwokWord());

        TextView defaultWordTranslation = (TextView) listItem.findViewById(R.id.default_text_view);
        defaultWordTranslation.setText(currentWord.getTranslationWord());

        View lin = listItem.findViewById(R.id.line_layout);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        lin.setBackgroundColor(color);

        return listItem;

    }
}
