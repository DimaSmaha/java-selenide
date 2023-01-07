package pageObjects;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class radiobuttonPage extends basePage{
    String baseUrl = "https://demoqa.com/radio-button";
    SelenideElement yesRadioBtn = $("#yesRadio");
    SelenideElement impressiveRadioBtn = $("#impressiveRadio");
    SelenideElement noRadioBtn = $("#noRadio");
    SelenideElement radioBtnNotification = $(".text-success");
    SelenideElement questionText = $(".mb-3");
    public void openRadiobuttonPage(){
        Selenide.open(baseUrl);
    }
    public void clickYesRadioBtn(){
        yesRadioBtn.click(ClickOptions.usingJavaScript());
        //for force clicking
    }
    public void clickImpressiveRadioBtn(){
        impressiveRadioBtn.click(ClickOptions.usingJavaScript());
    }
    public void checkNotificationText(String notificationText){
        radioBtnNotification.shouldHave(text(notificationText));
    }

    public void checkNotificationTextColor(String notificationText){
        radioBtnNotification.shouldHave(cssValue("color","rgba(40, 167, 69, 1)"));
    }
    public void isNoRadioBtnDisabled(){
        noRadioBtn.shouldBe(disabled);
    }
    public void verifyQuestionText(String question){
       questionText.shouldHave(partialText(question));
    }
}
