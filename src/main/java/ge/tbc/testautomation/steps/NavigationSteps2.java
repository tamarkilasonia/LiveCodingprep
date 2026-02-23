//package ge.tbc.testautomation.steps;
//
//import com.microsoft.playwright.Page;
//import ge.tbc.testautomation.pages.TbcHomePage;
//import ge.tbc.testautomation.pages.TbcMenuPage;
//import ge.tbc.testautomation.pages.TbcMyBuisnessMenu;
//
////Home-Menu-POS
//public class NavigationSteps2 extends CommonSteps{
//    private final TbcHomePage homepage ;
//    private final TbcMyBuisnessMenu buisnesmenu;
//
//public NavigationSteps2(Page page){
//    super(page);
//    this.homepage=new TbcHomePage(page);
//    this.buisnesmenu=new TbcMyBuisnessMenu(page);
//}
//public NavigationSteps2 clickMyBuisness(){
//    homepage.mybuisnessItem.click();
//    return this;
//}
//public NavigationSteps2 clickPosTerminal(){
//    buisnesmenu.PosTerminal.click();
//    return this;
//}
//}
