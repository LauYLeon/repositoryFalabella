package actions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AddCarPage;

import static org.hamcrest.MatcherAssert.assertThat;

//@DefaultUrl("/index.php?controller=authentication&back=my-account")
public class AddCarActions extends AddCarPage {

    public AddCarActions(WebDriver driver) {
        super(driver);
    }

    public void ingresarProducto(String producto) {
        enter(producto).into(getCampoBuscar());
        getBtnBuscar().click();
       // valiarConsulta();
        seleccionarProducto();
    }

    public void valiarConsulta() {
        assertThat("El titulo deberia coincidir",
                "Resultado (3)",
                Matchers.is(getTituloCompararBusqueda().getText()));
    }
    public void seleccionarProducto() {
        waitFor(getContenedorProducto());
        Actions actions = new Actions(getDriver());
         actions.moveToElement
                 (getContenedorProducto()).build().perform();
        getBtnAgregar().click();
    }

    public void validarProductoAgregadoCarrito(String msjConfirmacion){
        assertThat("El titulo deberia coincidir",
                msjConfirmacion,
                Matchers.is(getMsjConfirmacionProductoAgregado().getText()));
    }
}
