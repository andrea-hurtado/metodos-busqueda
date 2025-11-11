package views;

import models.Persona;
public class ShowConsole{
    
    public ShowConsole(){

    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.print(numeros[i]);     
            }else{
                System.out.print(numeros[i] + ",");
            }        
        }
        System.out.println("]");    
    }

    public void printResult(int numeroBuscar, int posicion) {
        if (posicion == -1) {
            System.out.println("Error -> No se encontró");        
        } else {
            System.out.println("El numero " + numeroBuscar + " se encontro en la posición " + posicion);
        }
    }
    public void printResult(Integer result){
        if (result != null) {
            System.out.println("El numero "  + result + " no se encontro ");
        }else {
            System.out.println("El número no fue encontrado.");
        }

    }
    public void showPersonResult(Persona resultadoPersona, String name){
        System.out.println(resultadoPersona != null
        ? "Se encontro a " + resultadoPersona : "No se encontro a una persona con el nombre " + name);

    }
    public void showPersonResult(Persona resultadoPersona, int age){
        System.out.println(resultadoPersona != null
        ? "Se encontro a " + resultadoPersona : "No se encontro a una persona con la edad " + age);

    }
    
    
    public void showPersonResult(Persona persona, int value, boolean valorNombre) {
        if (persona != null) {
            System.out.println("Se encontró una persona con nombre que vale " + value + ": " + persona.getName());
        } else {
            System.out.println("No se encontró ninguna persona cuyo nombre valga " + value + ".");
        }
    }
}