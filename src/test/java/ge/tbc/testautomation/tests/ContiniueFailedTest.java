//package ge.tbc.testautomation.tests;
//
//import ge.tbc.testautomation.steps.TerminalSteps;
//import org.testng.annotations.Test;
//
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//
//public class ContiniueFailedTest extends BaseTest{
//    @Test
//    public void ContiniueFailedTest(){
//        NavigationStep2
//                .clickMyBuisness()
//                .clickPosTerminal();
//
//        terminalSteps
//                .hoverStandartTerminal()
//                .clickFilloutButton();
//
//        filloutsteps
//                .fillForm("საიდენტიფიკაციო კოდი ან პირადი ნომერი","6057578")
//                .fillForm("საქმიანობის სფერო", "IT")
//                .fillForm("მისამართი, სადაც ტემინალი განთავსდება", "ქუთაისი")
//                .fillForm("საკონტაქტო პირის სახელი და გვარი", "თამარ კილასონია")
//                .fillForm("საკონტაქტო პირის ტელეფონი", "958575859")
//                .clickContinue();
//
//        assertThat(page).hasURL("https://tbcbank.ge/ka/pos-terminals/order/pos/1/1");
//
//    }
//}
