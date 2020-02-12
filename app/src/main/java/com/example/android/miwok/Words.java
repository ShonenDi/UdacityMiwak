package com.example.android.miwok;

class Words {
    private String miwokWord;
    private String translationWord;

    public Words(String miwokWord, String translationWord) {
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
