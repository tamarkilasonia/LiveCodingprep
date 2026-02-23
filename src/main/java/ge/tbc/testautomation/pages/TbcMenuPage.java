package ge.tbc.testautomation.pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static ge.tbc.testautomation.data.Constant.TEXT_MYBUISNESS;
import static ge.tbc.testautomation.data.Constant.TEXT_TBC_MENU;

public class TbcMenuPage extends CommonPage {
    public Locator Mortgage;

    public TbcMenuPage(Page page){
        super(page);
        this.Mortgage= page.locator("//span[text()='იპოთეკური']");
                //page.getByText(TEXT_MYBUISNESS, new Page.GetByTextOptions().setExact(true)).first();
    }
}
