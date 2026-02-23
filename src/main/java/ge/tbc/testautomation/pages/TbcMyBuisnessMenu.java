package ge.tbc.testautomation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TbcMyBuisnessMenu extends CommonPage {
    public Locator PosTerminal;
    public Locator mybuisnessItem;


    public TbcMyBuisnessMenu(Page page) {
        super(page);
        this.mybuisnessItem=page
                .locator("div.tbcx-pw-navigation-item__link")
                .filter(new Locator.FilterOptions().setHasText("ჩემი ბიზნესისთის"))
                .first();

        this.PosTerminal = page
                .locator("span.tbcx-pw-mega-menu-sub-item__title")
                .filter(new Locator.FilterOptions().setHasText("POS ტერმინალები"))
                .first();
    }

}