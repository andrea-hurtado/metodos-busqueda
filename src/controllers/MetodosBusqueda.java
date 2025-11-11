package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Persona;
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
        showConsole.printResult(5, result1);
        //Busca el -2
        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(-2, result2);
        //Busca el 20
        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(20, result3);
        
        //Buscar el 10   
        int result4 = busquedaLinealWhile(100);
        showConsole.printResult(result4);

        // Busca el 100 como objeto
        Integer result5 = busquedaLinealObj(10);
        showConsole.printResult(result5);

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
                return contador;
            }else{
                contador++;
            }  
        }
        return -1;
    }

    //Retorna el OBJETO buscado si lo encontró 
    //Si no encontro retorna null;
    public Integer busquedaLinealObj(int numeroBuscar){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscar) {
                return arreglo[i];
            }
        }
        return null;
    }

    public Persona searchPersonByName(Persona[] personas, String name){
        for (Persona persona : personas) {
            //equals es solo para texto
            if (persona.getName().equals(name)) {
                return persona;
            }
        }
        return null;
    }

    public Persona findPersonByAgeImpar(Persona[] personas, int age){
            for (Persona persona2 : personas) {
                if (persona2.getAge() > age) {
                    if (persona2.getAge() % 2 != 0) {
                        return persona2;
                        
                    } 
            } 
                           
        }
        return null;        
    }
    
    public Persona findPersonByValue(Persona[] personas, int value) {
        for (Persona persona : personas) {
            String nombre = persona.getName();
            int suma = 0;

            for (int i = 0; i < nombre.length(); i++) {
                char letra = nombre.charAt(i);
                suma += (int) letra; // Convierte la letra a su valor ASCII
            }
            
            if (suma == value) {
            return persona;
            }
        }
        return null;
    }

}


