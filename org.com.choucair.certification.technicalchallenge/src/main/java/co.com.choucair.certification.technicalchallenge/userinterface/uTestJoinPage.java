package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestJoinPage {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to join")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("where do write the first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do write the last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("where do write the the email")
            .located(By.id("email"));
    public static final Target DATE_MONTH = Target.the("where do write date month")
            .located(By.id("birthMonth"));
    public static final Target DATE_DAY = Target.the("where do write the date day ")
            .located(By.id("birthDay"));
    public static final Target DATE_YEAR = Target.the("where do write the date year")
            .located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON = Target.the("button to access location options")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target DEVICE_BUTTON = Target.the("button to access devices options")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target LASTSTEP_BUTTON = Target.the("button to access laststep options")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));
    public static final Target PASSWORD = Target.the("where do write the password ")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where do comfirm the password ")
            .located(By.id("confirmPassword"));
    public static final Target CHECKMARK_TERMSOFUSE = Target.the("where do checkmark terms of use ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKMARK_PRIVACYANDSECURITYPOLICE = Target.
            the("where do checkmark the privacy & security police")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETESETUP_BUTTON = Target.the("button to complete the join")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
