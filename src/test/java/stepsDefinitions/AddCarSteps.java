package stepsDefinitions;

import actions.AddCarActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AddCarSteps {
    @Managed
    WebDriver driver;
    AddCarActions addCarActions = new AddCarActions(driver);

    @Given("^que el usuario se encuentre en la pantalla principal de la pagina$")
    public void queElUsuarioSeEncuentreEnLaPantallaPrincipalDeLaPagina() {
        addCarActions.open();
    }

    @Given("^Busque el (.*) que desea agreagar al carrito$")
    public void busqueElQueDeseaAgreagarAlCarrito(String producto) {
        addCarActions.ingresarProducto(producto);
    }


    @Then("^el usuario deberia ver (.*)$")
    public void elUsuarioDeberiaVer(String msjConfirmacion) {
        addCarActions.validarProductoAgregadoCarrito(msjConfirmacion);
    }
}
