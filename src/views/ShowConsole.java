package views;

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

    public void printResult(int numeroBuscar, int result1) {
        if (result1 == -1) {
            System.out.println("Error -> No se encontró");        
        } else {
            System.out.println("El numero " + numeroBuscar + " se encontro en la posición " + result1);
        }
    }
    public void printResult(Integer result){
        if (result != null) {
            System.out.println("El numero" + "{" + result + "}");
            
        }

    }
    
}