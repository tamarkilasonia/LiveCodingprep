package ge.tbc.testautomation.steps;

import com.microsoft.playwright.Page;
import ge.tbc.testautomation.pages.TbcHomePage;
import ge.tbc.testautomation.pages.TbcMenuPage;

public class NavigationSteps3 extends CommonSteps{
private final TbcHomePage homepage;
private final TbcMenuPage menuPage;

    public NavigationSteps3(Page page) {
        super(page);
        this.homepage=new TbcHomePage(page);
        this.menuPage=new TbcMenuPage(page);



    }
    public NavigationSteps3 ClickMyItem(){
        homepage.myItem.click();
        return this;
    }
    public NavigationSteps3 ClickMortage(){
        menuPage.Mortgage.click();
        return this;
    }
}
