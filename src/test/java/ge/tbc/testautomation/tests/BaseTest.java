package ge.tbc.testautomation.tests;

import com.microsoft.playwright.*;
import ge.tbc.testautomation.steps.FillOutInfoSteps;
import ge.tbc.testautomation.steps.MortgageSteps;

import ge.tbc.testautomation.steps.NavigationSteps3;
import ge.tbc.testautomation.steps.TerminalSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
Page page;

NavigationSteps3 navigationSteps;
MortgageSteps mortgageSteps;

//NavigationSteps2  NavigationStep2;
//TerminalSteps terminalSteps;
//FillOutInfoSteps filloutsteps;

//TbcNavigationStep tbcNavigationStep;
//TechSchoolSteps techSchoolSteps;

    @BeforeClass
    @Parameters("browserType")
    public void initializeSteps(@Optional("chrome") String browserType) {

        playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.setHeadless(false);

        switch (browserType.toLowerCase()) {
            case "firefox":
                browser = playwright.firefox().launch(launchOptions);
                break;
            case "webkit":
                browser = playwright.webkit().launch(launchOptions);
                break;
            default:
                browser = playwright.chromium().launch(launchOptions);
                break;
        }

        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://tbcbank.ge/ka");

        navigationSteps = new NavigationSteps3(page);
        mortgageSteps = new MortgageSteps(page);

//    NavigationStep2= new NavigationSteps2(page);
//    terminalSteps=new TerminalSteps(page);
//    filloutsteps= new FillOutInfoSteps(page);
}
@AfterClass
public void tearDown(){
page.close();
browser.close();
playwright.close();
    }
}

