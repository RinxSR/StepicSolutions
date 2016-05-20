package org.javacourse.part3.analysercomment;

public class Main {
    public static void main(String[] args) {

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {

        for (TextAnalyzer analyzer : analyzers) {
            if (!(analyzer.processTest(text).equals(Label.OK))) {
                return analyzer.processTest(text);
            }
        }

        return Label.OK;
    }
}
