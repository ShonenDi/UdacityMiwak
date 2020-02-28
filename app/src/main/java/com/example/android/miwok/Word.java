package com.example.android.miwok;

public class Word {
    private String miwokWord;
    private String mTranslationWord;
    private int mAudioID;
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

    public Word( String miwokWord, String mTranslationWord, int mWordImageId,int mAudioID) {
        this.miwokWord = miwokWord;
        this.mTranslationWord = mTranslationWord;
        this.mWordImageId = mWordImageId;
        this.mAudioID = mAudioID;

    }

    public int getmAudioID() {
        return mAudioID;
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

    @Override
    public String toString() {
        return "Word{" +
                "miwokWord='" + miwokWord + '\'' +
                ", mTranslationWord='" + mTranslationWord + '\'' +
                ", mAudioID=" + mAudioID +
                ", mWordImageId=" + mWordImageId +
                '}';
    }
}
