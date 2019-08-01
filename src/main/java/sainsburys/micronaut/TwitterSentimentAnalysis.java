package sainsburys.micronaut;

import io.micronaut.core.annotation.*;

@Introspected
public class TwitterSentimentAnalysis {

    private String tweet;

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTweet() {
        return tweet;
    }

}

