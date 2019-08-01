package sainsburys.micronaut;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface TwitterSentimentAnalysisClient {

    @Named("twitter-sentiment-analysis")
    Single<TwitterSentimentAnalysis> apply(@Body TwitterSentimentAnalysis body);

}
