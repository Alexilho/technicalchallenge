package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.CompleteJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Result implements Question<Boolean> {
    private String question;

    /*
    public Result(String question){
        this.question = question;
    }
    public static Result toThe(String question){
        return new Result(question);
    }
    */
    public Result(){
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String CaptchaMessage= Text.of(CompleteJoin.CAPTCHAMESSAGE).viewedBy(actor).asString();
        String WelcomeMessage= Text.of(CompleteJoin.WELCOME).viewedBy(actor).asString();
        if (question.equals(WelcomeMessage)||question.equals(CaptchaMessage)){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}