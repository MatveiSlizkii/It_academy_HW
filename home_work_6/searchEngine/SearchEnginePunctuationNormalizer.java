package home_work_6.searchEngine;

import home_work_6.searchEngine.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer (ISearchEngine searchEngine){
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        return 0;
    }
}
