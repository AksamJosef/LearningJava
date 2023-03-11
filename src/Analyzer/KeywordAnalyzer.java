package Analyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String x : getKeywords()) {
            if (text.contains(x)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

}
