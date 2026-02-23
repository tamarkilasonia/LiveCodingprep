package ge.tbc.testautomation.pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static ge.tbc.testautomation.data.Constant.TEXT_MYBUISNESS;
import static ge.tbc.testautomation.data.Constant.TEXT_TBC_MENU;

public class TbcHomePage extends CommonPage {
public Locator myItem;
   // public Locator mybuisnessItem;
private final Page page;

    public TbcHomePage(Page page){
        super(page);
        this.page=page;
        this.myItem=page.locator("//div[text()=' ჩემთვის ']");
        //this.mybuisnessItem = page.locator("//div[text()=' ჩემი ბიზნესისთვის ' ]");
                //page.getByText(TEXT_MYBUISNESS, new Page.GetByTextOptions().setExact(true)).first();
    }

    public Locator form(String placeHolder){
        return page.locator("//input[@placeholder='" + placeHolder + "']");
    }
}
