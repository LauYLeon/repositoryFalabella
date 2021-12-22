package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "testId-SearchBar-Input")
    private WebElementFacade campoBuscar;
    @FindBy(className = "SearchBar-module_searchBtnIcon__6KVum")
    private WebElementFacade btnBuscar;
    @FindBy(id = "testId-SearchLandingContainer-totalResults")
    private WebElementFacade tituloCompararBusqueda;
    @FindBy(id = "testId-Pod-action-9461744")
    private WebElementFacade btnAgregar;
    @FindBy(xpath = "//div[contains(@data-key,'9461744')]")
    private WebElementFacade contenedorProducto;
    @FindBy(xpath = "(//span[contains(.,'Producto(s) agregado(s) a la bolsa de compras')])[2]")
    private WebElementFacade msjConfirmacionProductoAgregado;



    public WebElementFacade getCampoBuscar() {
        return campoBuscar;
    }

    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getTituloCompararBusqueda() {
        return tituloCompararBusqueda;
    }

    public WebElementFacade getBtnAgregar() {
        return btnAgregar;
    }

    public WebElementFacade getContenedorProducto() {
        return contenedorProducto;
    }

    public WebElementFacade getMsjConfirmacionProductoAgregado() {
        return msjConfirmacionProductoAgregado;
    }
}
