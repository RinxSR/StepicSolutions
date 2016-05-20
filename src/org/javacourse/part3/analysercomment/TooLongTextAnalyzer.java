package org.javacourse.part3.analysercomment;

public class TooLongTextAnalyzer implements TextAnalyzer {

    int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public TooLongTextAnalyzer() {
    }

    @Override
    public Label processTest(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
