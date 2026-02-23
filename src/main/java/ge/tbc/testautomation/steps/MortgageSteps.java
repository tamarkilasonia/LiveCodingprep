package ge.tbc.testautomation.steps;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import ge.tbc.testautomation.pages.MortgagePage;

public class MortgageSteps extends CommonSteps {
    private final MortgagePage mortgagePage;
    private final Page page;

    public MortgageSteps(Page page) {
        super(page);
        this.page = page;
        mortgagePage = new MortgagePage(page);

    }

    public MortgageSteps SelectIncome() {
        mortgagePage.ByIncome.click();
        return this;
    }

    public MortgageSteps enterIncome(String amount) {
        mortgagePage.IncomeInput.waitFor();
        mortgagePage.IncomeInput.fill(amount);

        return this;
    }

    public MortgageSteps chooseUSD() {
        mortgagePage.USD.click();
        return this;
    }

    public MortgageSteps enterYear(String year) {
        mortgagePage.yearInput.waitFor();
        mortgagePage.yearInput.fill(year);

        return this;

    }

    // 5. Move slider
    public MortgageSteps moveSlider() {
        mortgagePage.SliderBar.dragTo(mortgagePage.SliderBar);
        return this;
    }

    public MortgageSteps validateLoanYear(String expectedYear){
        PlaywrightAssertions.assertThat(mortgagePage.LoanYear)
                .containsText(expectedYear);
        return this;
    }

    public MortgageSteps validateInteresRate(){
        PlaywrightAssertions.assertThat(mortgagePage.EffectiveInterestrate)
                .containsText("11.73");
        return this;
    }
}