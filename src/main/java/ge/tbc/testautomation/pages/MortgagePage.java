package ge.tbc.testautomation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MortgagePage extends CommonPage{
    public Locator ByIncome;
    public Locator IncomeInput;
public Locator USD;
public Locator yearInput;
public Locator SliderBar;
public Locator LoanYear ;
 public Locator EffectiveInterestrate;


    public MortgagePage(Page page) {
        super(page);
        this.ByIncome=page.locator("//span[text()='შემოსავლით']");
        this.IncomeInput=page.locator("(//input[@type='number'])[1]");
this.USD=page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("USD")).first();
this.yearInput=page.locator("//input[@type='number']").nth(1);
this.SliderBar=page.locator("//div[@class='slider-circle-button']");
this.LoanYear=page.locator(  "//div[contains(text(),'წელი')]/following-sibling::div");
this.EffectiveInterestrate=page.locator("//div[contains(text(),'ეფექტური საპროცენტო განაკვეთი')]/following-sibling::div");

    }
}
