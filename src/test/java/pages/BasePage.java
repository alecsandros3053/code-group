package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public void escolherItemComboBox(String valor, WebElement comboBox) {
        Select select = new Select(comboBox);
        select.selectByVisibleText(valor);
    }

    public void clickBotao(WebElement botao) {
        botao.click();
    }

    public void preencherCampoTexto(String texto, WebElement elemento) {
        elemento.sendKeys(texto);
    }

    public String obterMensagem(WebElement elemento) {

        return elemento.getText();
    }
}
