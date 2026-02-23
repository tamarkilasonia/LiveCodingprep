package ge.tbc.testautomation.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

public class CommonPage {
    public com.microsoft.playwright.Locator tbcLogo;
    public Locator SearchIcon;
    public Locator languageSwitchIcon;

    public CommonPage(Page page){
this.tbcLogo= page.locator("//*[local-name()='svg' and @class='tbcge']");
        this.SearchIcon = page.locator("//tbcx-icon[contains(text(),'globe-outline')]");
            this.languageSwitchIcon=page.locator("//tbcx-icon[contains(text(),'globe-outlined')]");

    }
}
