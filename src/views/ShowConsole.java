package views;

public class ShowConsole{
    
    public ShowConsole(){

    }

    public static void printArray(int[] numeros){
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
}