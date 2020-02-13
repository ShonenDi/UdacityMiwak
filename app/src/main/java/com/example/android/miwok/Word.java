package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String mTranslationWord;

    public Word(String miwokWord, String translationWord) {
        this.miwokWord = miwokWord;
        this.mTranslationWord = translationWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getmTranslationWord() {
        return mTranslationWord;
    }
}
