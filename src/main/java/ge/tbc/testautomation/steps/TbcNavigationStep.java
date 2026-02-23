//package ge.tbc.testautomation.steps;
//
//import com.microsoft.playwright.Page;
//import ge.tbc.testautomation.pages.TbcHomePage;
//import ge.tbc.testautomation.pages.TbcMenuPage;
//
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//public class TbcNavigationStep extends CommonSteps {
//    private final TbcHomePage homePage;
//    private final TbcMenuPage menupage;
//
//
//    public TbcNavigationStep(Page page) {
//        super(page);
//        this.homePage = new TbcHomePage(page);
//        this.menupage = new TbcMenuPage(page);
//
//    }
//
//    public TbcNavigationStep clickTbcMenu() {
//        assertThat(homePage.tbcMenuItem).isVisible();
//        menupage.tbcMenuItem.hover();
//        return this;
//    }
//
//    public TbcNavigationStep clickTechSchool() {
//        assertThat(menupage.techschool).isVisible();
//        menupage.techschool.click();
//        return this;
//    }
//}