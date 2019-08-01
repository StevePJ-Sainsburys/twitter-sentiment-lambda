package sainsburys.micronaut;

import io.micronaut.function.FunctionBean;
import io.micronaut.function.executor.FunctionInitializer;

import java.io.IOException;
import java.util.function.Function;

@FunctionBean("twitter-sentiment-analysis")
public class TwitterSentimentAnalysisFunction extends FunctionInitializer implements Function<TwitterSentimentAnalysis, TwitterSentimentAnalysis> {

    private ComprehensionService comprehensionService;

    public TwitterSentimentAnalysisFunction(ComprehensionService comprehensionService) {
        this.comprehensionService = comprehensionService;
    }

    @Override
    public TwitterSentimentResult apply(TwitterSentimentAnalysis msg) {
        return new TwitterSentimentResult(comprehensionService.apply(msg.getTweet()));
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        TwitterSentimentAnalysisFunction function = new TwitterSentimentAnalysisFunction(new ComprehensionService());
        function.run(args, (context)-> function.apply(context.get(TwitterSentimentAnalysis.class)));
    }    
}

