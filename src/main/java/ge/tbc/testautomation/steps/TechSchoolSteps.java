//package ge.tbc.testautomation.steps;
//
//import com.microsoft.playwright.Page;
//import ge.tbc.testautomation.pages.TechSchoolPage;
//
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//public class TechSchoolSteps extends CommonSteps{
//    private final TechSchoolPage techSchoolPage;
//
//
//    public TechSchoolSteps(Page page) {
//        super(page);
//        this.techSchoolPage=new TechSchoolPage(page);
//    }
//    public  TechSchoolSteps assertCourseVisible(){
//        assertThat(techSchoolPage.courseLabel).isVisible();
//        return this;
//    }
//}
