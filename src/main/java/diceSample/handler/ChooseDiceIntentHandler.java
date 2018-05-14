package diceSample.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class ChooseDiceIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("chooseDiceIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Du benutzt einen Würfel mit " + this.event.currentIntent.slotDetails.zahl.originalValue + " Seiten.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Würfel", speechText)
                .build();
    }
}
