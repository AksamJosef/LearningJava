package Analyzer;


public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String [] keywords;
    public NegativeTextAnalyzer() {
        this.keywords = new String[] {":(",  "=(",  ":|"};
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }


    @Override
    public Label processText(String text) {
        return super.processText(text);
    }
}
