package org.javacourse.part3.analysercomment;

public class SpamAnalyser extends KeywordAnalyser{

    private String[] keywords;

    public SpamAnalyser(String[] keywords) {
        this.keywords = keywords;
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
        return Label.SPAM;
    }


}
