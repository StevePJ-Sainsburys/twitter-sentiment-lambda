package sainsburys.micronaut;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class TwitterSentimentAnalysisFunctionTest {

    @Inject
    TwitterSentimentAnalysisClient client;

    @Test
    public void testFunction() throws Exception {
    	TwitterSentimentAnalysis body = new TwitterSentimentAnalysis();
    	body.setName("twitter-sentiment-analysis");
        assertEquals("twitter-sentiment-analysis", client.apply(body).blockingGet().getName());
    }
}
