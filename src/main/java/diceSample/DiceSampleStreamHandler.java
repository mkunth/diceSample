package diceSample;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import diceSample.handler.CancelAndStopIntentHandler;
import diceSample.handler.ChooseDiceIntentHandler;
import diceSample.handler.RollDiceIntentHandler;
import diceSample.handler.HelpIntentHandler;
import diceSample.handler.LaunchRequestHandler;
import diceSample.handler.SessionEndedRequestHandler;

public class DiceSampleStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(new ChooseDiceIntentHandler(), new CancelAndStopIntentHandler(), new RollDiceIntentHandler(), new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
                .build();
    }

    public DiceSampleStreamHandler() {
        super(getSkill());
    }
}
