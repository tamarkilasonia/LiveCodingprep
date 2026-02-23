package ge.tbc.testautomation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class FillTheInfo extends CommonPage{
    private Page page;
    public static Locator personalnumInput;
    public static Locator activityInput;
    public static Locator addresInput;
    public static Locator nameInput;
    public static Locator phonenum;
    public static Locator ContinueButton;



    public FillTheInfo(Page page) {
        super(page);
        this.page=page;
        this.personalnumInput = page.getByLabel("Identifiation code or personal number");
        this.activityInput = page.getByLabel("Field of activity");
        this.addresInput = page.getByLabel("POS Terminal and pysical address");
        this.nameInput = page.getByLabel("Contact person name and surname");
        this.phonenum = page.getByLabel("Contant person name");

//this.personalnumInput=page.locator("//label[text()='Identifiation code or personal number ']");
       this.activityInput=page.locator("//label[text()='Field of activity ']");
//
//                this.addresInput=page.locator("//label[text()='POS Terminal and pysical address ']");
//                        this.nameInput=page.locator("//label[text()='Contact person name and surname ']");
//                                this.phonenum=page.locator("//label[text()='Contant person name ']");
//                                this.ContinueButton=page.locator("Continue");

        this.ContinueButton =
                page.getByRole(
                        AriaRole.BUTTON,
                        new Page.GetByRoleOptions().setName("გაგრძელება")
                );

    }
    public Locator form(String placeHolder){
        return page.locator("//input[@placeholder='" + placeHolder + "']");
    }
}
