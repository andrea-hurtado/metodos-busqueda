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
    public void showPersonResult(Persona resuldadoPersona, String name){
        System.out.println(resuldadoPersona != null
        ? "Se encontro a " + resuldadoPersona : "No se encontro a una persona con el nombre " + name);

    }
    public void showPersonResult(Persona resuldadoPersona, int age){
        System.out.println(resuldadoPersona != null
        ? "Se encontro a " + resuldadoPersona : "No se encontro a una persona con la edad " + age);

    }
    
}