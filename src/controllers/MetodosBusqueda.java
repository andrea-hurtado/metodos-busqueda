package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda(){
        this.arreglo = new int[] {10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

        //Busca el 5
        int result1 = busquedaLineal(5);
        showConsole.printResult(result1, 5);
        //Busca el -2
        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(result2, -2);
        //Busca el 20
        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(result3, 20);
        //Buscar el 100
        Integer result4 = busquedaLinealObj(100);
        showConsole.printResult(result4);
    }

    // Retorna la posicion del valor buscado
    // Si no encontro retorna -1
    public int busquedaLineal(int numeroBuscar){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscar) {    
                return i;      
            }
        }
        return -1;
    }
    public int busquedaLinealWhile(int numeroBuscar){
        int contador = 0;
        while (contador < arreglo.length) {
            if (arreglo[contador] == numeroBuscar) {
                return numeroBuscar;
            }else{
                numeroBuscar++;
            }
            
        }
        return -1;
    }

    //Retorna el OBJETO buscado si lo encontró 
    //Si no encontro retorna null;
    public Integer busquedaLinealObj(int numeroBuscar){
        return null;
    }

}

