package org.javacourse.part3.analysercomment;

public class NegativeTextAnalyzer extends KeywordAnalyser{

    private String[] keywords = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {

    }

    @Override
    public Label processTest(String text) {
        for (String keyword : getKeyword()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeyword() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
