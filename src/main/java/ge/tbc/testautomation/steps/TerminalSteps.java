package ge.tbc.testautomation.steps;

import com.microsoft.playwright.Page;
import ge.tbc.testautomation.pages.TerminalPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TerminalSteps extends CommonSteps {

    private TerminalPage terminalPage;

    public TerminalSteps(Page page) {
        super(page);
        this.terminalPage = new TerminalPage(page);
    }

    public TerminalSteps hoverStandartTerminal(){
        assertThat(terminalPage.standardterminal).isVisible();
        terminalPage.standardterminal.hover();

        return this;
    }

    public TerminalSteps clickFilloutButton() {
        terminalPage.FillOutFormButton.click();
        return this;
    }
}