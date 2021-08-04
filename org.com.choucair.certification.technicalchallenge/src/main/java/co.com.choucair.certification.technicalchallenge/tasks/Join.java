package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.uTestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Join implements Task{

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strDateMonth;
    private String strDateDay;
    private String strDateYear;
    private String strPassword;

    public Join(String strFirstName, String strLastName, String strEmail,
                String strDateMonth,String strDateDay,String strDateYear, String strPassword){
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strDateMonth = strDateMonth;
        this.strDateDay = strDateDay;
        this.strDateYear = strDateYear;
        this.strPassword = strPassword;
    }
    public static Join onThePage(String strFirstName, String strLastName, String strEmail,
                                 String strDateMonth,String strDateDay,String strDateYear, String strPassword){
        return Tasks.instrumented(Join.class,strFirstName,strLastName,
                strEmail,strDateMonth,strDateDay,strDateYear,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestJoinPage.LOGIN_BUTTON),
                Enter.theValue(strFirstName).into(uTestJoinPage.FIRST_NAME),
                Enter.theValue(strLastName).into(uTestJoinPage.LAST_NAME),
                Enter.theValue(strEmail).into(uTestJoinPage.EMAIL),
                SelectFromOptions.byVisibleText(strDateMonth).from(uTestJoinPage.DATE_MONTH),
                SelectFromOptions.byVisibleText(strDateDay).from(uTestJoinPage.DATE_DAY),
                SelectFromOptions.byVisibleText(strDateYear).from(uTestJoinPage.DATE_YEAR),
                Click.on(uTestJoinPage.LOCATION_BUTTON),
                Click.on(uTestJoinPage.DEVICE_BUTTON),
                Click.on(uTestJoinPage.LASTSTEP_BUTTON),
                Enter.theValue(strPassword).into(uTestJoinPage.PASSWORD),
                Enter.theValue(strPassword).into(uTestJoinPage.CONFIRM_PASSWORD),
                Click.on(uTestJoinPage.CHECKMARK_TERMSOFUSE),
                Click.on(uTestJoinPage.CHECKMARK_PRIVACYANDSECURITYPOLICE)
                //Click.on(uTestJoinPage.COMPLETESETUP_BUTTON)
        );
    }
}
