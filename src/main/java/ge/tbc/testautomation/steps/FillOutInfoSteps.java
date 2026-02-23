package ge.tbc.testautomation.steps;

import com.microsoft.playwright.Page;
import ge.tbc.testautomation.pages.FillTheInfo;

public class FillOutInfoSteps extends CommonSteps{
private final FillTheInfo infopage;

    public FillOutInfoSteps(Page page) {
        super(page);
        this.infopage=new FillTheInfo(page);

    }
    public FillOutInfoSteps fillForm(){
        FillTheInfo.personalnumInput.fill("60201169338");
        FillTheInfo.activityInput.fill("IT Services");
        FillTheInfo.addresInput.fill("Kutaisi");
        FillTheInfo.nameInput.fill("Test User");
        FillTheInfo.phonenum.fill("555123456");
        return this;
    }

    public FillOutInfoSteps clickContinue(){
        FillTheInfo.ContinueButton.click();
        return this;
    }
    public FillOutInfoSteps fillForm(String placeHolder, String text){
       infopage.form(placeHolder).fill(text);
       return this;

    }
}
