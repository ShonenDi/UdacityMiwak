package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, ArrayList<Word> arrayList) {
        super(context, 0, arrayList);

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


        return listItem;

    }
}
