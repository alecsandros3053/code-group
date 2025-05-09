package pages;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class HomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement twotabsearchtextbox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement navsearchsubmitbutton;

    @FindBy(xpath = "(//span[.='Um iPhone novo para chamar de seu.'])[1]")
    private WebElement text;

    @FindBy(xpath = "//h2[.='Precisa de ajuda?']")
    private WebElement texth2;

    @FindBy(xpath = "(//a[.='Venda na Amazon'])[1]")
    private WebElement vendaAmazon;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement navHamburgerMenu;

    @FindBy(xpath = "(//a[.='Mais Vendidos'])[2]")
    private WebElement maisVendidos;

    @FindBy(xpath = "//span[.='Mais vendidos']")
    private WebElement maisVendidos2Text;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void inputSearchText(String searchText) {
        HelperWait.waitPresenceOfElement(twotabsearchtextbox, 60);
        twotabsearchtextbox.sendKeys(searchText);
    }

    public void clickSearch() {
        navsearchsubmitbutton.click();
    }

    public String getTextSearch() {
        return text.getText();
    }

    public String getTextH2() {
        return texth2.getText();
    }

    public String getVendaAmazon() {
        return vendaAmazon.getText();
    }

    public void clickMenu() {
        HelperWait.waitPresenceOfElement(navHamburgerMenu, 60);
        navHamburgerMenu.click();
    }

    public void maisVendidos() {
        HelperWait.waitPresenceOfElement(maisVendidos, 60);
        maisVendidos.click();
    }

    public String getTextMaisVendidos() {
        HelperWait.waitPresenceOfElement(maisVendidos2Text, 60);
        return maisVendidos2Text.getText();
    }
}
