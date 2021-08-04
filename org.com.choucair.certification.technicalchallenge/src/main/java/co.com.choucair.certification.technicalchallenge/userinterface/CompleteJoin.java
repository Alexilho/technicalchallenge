package co.com.choucair.certification.technicalchallenge.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteJoin {
    public static final Target COMPLETESETUP_BUTTON = Target.the("button to complete the join")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
    public static final Target CAPTCHAMESSAGE = Target.the("message of captcha")
            .located(By.xpath("/html/body/div[2]/div[4]/span/strong"));
    public static final Target WELCOME = Target.the("message to welcome to uTest")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
