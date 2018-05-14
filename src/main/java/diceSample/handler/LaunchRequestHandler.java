package diceSample.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Willkommen zum magischen Würfel. Jetzt kann es losgehen";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Würfel", speechText)
                .withReprompt(speechText)
                .build();
    }

}