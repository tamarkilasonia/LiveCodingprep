package ge.tbc.testautomation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class TerminalPage extends CommonPage{
    public Locator standardterminal;
    public Locator FillOutFormButton;

    public TerminalPage(Page page) {
        super(page);
        this.standardterminal=page.getByText("სტანდარტული ტერმინალი");
        this.FillOutFormButton=
                page.getByRole(
                        AriaRole.BUTTON,
                        new Page.GetByRoleOptions().setName("განაცხადის შევსება")).first();
    }
}
