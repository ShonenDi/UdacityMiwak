package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String translationWord;

    public Word(String miwokWord, String translationWord) {
        this.miwokWord = miwokWord;
        this.translationWord = translationWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getTranslationWord() {
        return translationWord;
    }
}
