package com.Google;

import java.util.Locale;

class WordFilter implements Filter{
    private String word;
    public void setWord(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }

    WordFilter(String word){
        this.word = word;
    }
    @Override
    public void doFilter() {
    word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
