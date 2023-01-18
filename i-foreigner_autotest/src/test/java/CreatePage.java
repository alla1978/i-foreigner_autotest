import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreatePage {

    public static SelenideElement email2 = $(byName("email"));

    public static SelenideElement password = $(byName("password"));

    public static SelenideElement repeatPassword = $(byName("repeatPassword"));

    public static SelenideElement inputCheckbox = $("div[class$=\"checkbox\"]");

    public static SelenideElement createButton = $x("//button");

    //public static SelenideElement registrationSuccess = $x("/html/body/div[1]/div/div/div/div[1]/div[2]");

    public static SelenideElement  registrationSuccess = $x("//div[@role=\"alert\"]");

    public static String registrationSuccessText = "Registration success";

}
