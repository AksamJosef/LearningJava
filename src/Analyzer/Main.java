package Analyzer;

import java.util.Arrays;

public class Main {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer ta : analyzers) {
            if (!ta.processText(text).equals(Label.OK)) {
                return ta.processText(text);
            }
        }
        return Label.OK;
    }

    //Твой код здесь

    //
    public static void main(String[] args) {
        NegativeTextAnalyzer nta = new NegativeTextAnalyzer();

    }
}
