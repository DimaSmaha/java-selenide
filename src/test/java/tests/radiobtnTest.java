package tests;

import org.junit.jupiter.api.Test;

public class radiobtnTest extends pageObjects.radiobuttonPage{

    @Test
    public void radiobtnTest(){
        openRadiobuttonPage();
        verifyQuestionText("Do you like the site?");
        clickYesRadioBtn();
        checkNotificationText("Yes");
        checkNotificationTextColor("Yes");
        clickImpressiveRadioBtn();
        checkNotificationText("Impressive");
        isNoRadioBtnDisabled();
    }
}
