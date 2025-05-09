package testes;

import helpers.HelperDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class DesafioRunnerTest {

    private final HomePage homePage = new HomePage();
    private static final String textSearch = "Um iPhone novo para chamar de seu.";
    private static final String textH2 = "Precisa de ajuda?";
    private static final String vendaAmazon = "Venda na Amazon";
    private static final String maisVendidos = "Mais vendidos";

    @Before
    public void setUp() {
        HelperDriver.inicializar();
    }

    @Test
    public void buscarNaCategoriaPadraoTest() {
        homePage.inputSearchText("smartphone");
        homePage.clickSearch();
        Assert.assertEquals(homePage.getTextSearch(), textSearch);
    }

    @Test
    public void nenhumResultadoTest() {
        homePage.inputSearchText("0sasa");
        homePage.clickSearch();
        Assert.assertEquals(homePage.getTextH2(), textH2);
    }

    @Test
    public void buscarSemDigitarNadaTest() {
        homePage.inputSearchText("");
        homePage.clickSearch();
        Assert.assertEquals(homePage.getVendaAmazon(), vendaAmazon);
    }

    @Test
    public void maisVendidosTest() {
        homePage.clickMenu();
        homePage.maisVendidos();
        Assert.assertEquals(homePage.getTextMaisVendidos(), maisVendidos);
    }

    @After
    public void tearDown() {
        HelperDriver.finalizar();
    }
}
