package sainsburys.micronaut;

import com.amazonaws.services.comprehend.model.DetectSentimentResult;

public class TwitterSentimentResult extends TwitterSentimentAnalysis {
    public TwitterSentimentResult(DetectSentimentResult result) {
        this.result = result.getSentiment();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String result;

}
