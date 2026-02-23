package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.steps.MortgageSteps;
import ge.tbc.testautomation.steps.NavigationSteps3;
import org.testng.annotations.Test;

public class MortgageTest extends BaseTest{
    @Test
    public void navigatetomortgage(){
        NavigationSteps3 navigationSteps = new NavigationSteps3(page);
        MortgageSteps mortgageSteps = new MortgageSteps(page);


        navigationSteps
                .ClickMyItem()
                .ClickMortage();



        mortgageSteps
                .SelectIncome()
                .enterIncome("5000")
                .chooseUSD()
                .enterYear("5")
                .validateLoanYear("5")
        .validateInteresRate();
    }
}
