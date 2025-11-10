import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda mBusqueda = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();
        //mBusqueda.busquedaLineal(5);
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        //Busqueda de Juan
        String name = "Juan";
        Persona resuldadoPersona = mBusqueda.searchPersonByName(personas, "Juan");
        //Imprime la persona si encontro
        //imprime no encontro una persona con el nombre _____
        showConsole.showPersonResult(resuldadoPersona, name);

        //busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = mBusqueda.findPersonByAgeImpar(personas, 25);
        showConsole.showPersonResult(resultadoPer2, 25);
    }
}
