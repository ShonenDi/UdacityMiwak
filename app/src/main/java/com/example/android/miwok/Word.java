package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String mTranslationWord;
    private int mWordImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


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

    public boolean hasImage() {
        return mWordImageId != NO_IMAGE_PROVIDED;
    }
}
