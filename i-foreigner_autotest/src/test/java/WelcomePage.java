import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WelcomePage {
    public static SelenideElement screateButton = $x("/html/body/div[1]/section/div/div/div/div[2]/button[1]");

    public static SelenideElement logButton = $x("/html/body/div[1]/section/div/div/div/div[2]/button[2]");


}
