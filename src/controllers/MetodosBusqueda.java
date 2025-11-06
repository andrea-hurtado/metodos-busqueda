package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda(int[] arreglo, ShowConsole showConsole){
        this.arreglo = new int[] {10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

    }

}
