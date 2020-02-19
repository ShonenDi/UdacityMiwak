package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String mTranslationWord;
    private int mWordImageId;


    public Word(String miwokWord, String translationWord) {
        this.miwokWord = miwokWord;
        this.mTranslationWord = translationWord;
    }

    public Word(String miwokWord, String mTranslationWord, int mWordImage) {
        this.miwokWord = miwokWord;
        this.mTranslationWord = mTranslationWord;
        this.mWordImageId = mWordImage;
    }

    public int getWordImage() {
        return mWordImageId;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public String getTranslationWord() {
        return mTranslationWord;
    }
}
