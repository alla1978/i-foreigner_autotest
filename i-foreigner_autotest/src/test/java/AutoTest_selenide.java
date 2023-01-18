import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.UUID;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoTest_selenide {
    WelcomePage welcomePage = new WelcomePage();
    CreatePage createPage = new CreatePage();


    @BeforeAll
    public static void setUpAll(){
    Configuration.browser = "chrome";
    Configuration.browserSize = "1280x800";
    Configuration.timeout = 40000;
    }

@BeforeEach
    public void setUp(){ open("https://i-foreigner.pl/"); }

    @Test
    public void regOK(){ //
    WelcomePage.screateButton.click();
    String email = "1212ddd@email.com";
    CreatePage.email2.sendKeys(email);
    CreatePage.password.sendKeys("BHBUY9DEKXNEsCssGqJQ1P");
    CreatePage.repeatPassword.sendKeys("BHBUY9DEKXNEsCssGqJQ1P");
    CreatePage.inputCheckbox.click();
    CreatePage.createButton.click();
    assertEquals(CreatePage.registrationSuccess,$x("//div[@role=\"alert\"]").getText());
    assertEquals(String.format(CreatePage.registrationSuccessText, email),$x("/html/body/div[1]/div/div/div/div[1]/div[2]").getText());
    }

    @Test
    public void emptyEmail(){
        WelcomePage.screateButton.click();
        CreatePage.email2.sendKeys("");
        CreatePage.repeatPassword.sendKeys("Login12345%");
        CreatePage.repeatPassword.sendKeys("Login12345%");
        CreatePage.inputCheckbox.click();
        CreatePage.createButton.click();
    }


}



