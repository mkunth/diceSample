package diceSample.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import com.amazon.ask.attributes.persistence.impl.
import java.util.Random;

import java.util.Optional;

public class RollDiceIntentHandler implements RequestHandler {


    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("rollDiceIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        int n =  this.event.request.intent.slots.zahl.value;
        Random ergebnis = random.nextInt(n - 1 + 1) + 1;
        String speechText = "Du hast eine " + ergebnis + " gewürfelt.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Würfel", speechText)
                .build();
    }


}
