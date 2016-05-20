package org.javacourse.part3.analysercomment;

public abstract class KeywordAnalyser implements TextAnalyzer{

    protected abstract String[] getKeyword();

    protected abstract Label getLabel();
}
