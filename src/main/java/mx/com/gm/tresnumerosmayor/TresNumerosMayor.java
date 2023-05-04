
package mx.com.gm.tresnumerosmayor;


import java.util.Scanner;

public class TresNumerosMayor {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero1 = Integer.parseInt(lector.nextLine()) ;
        System.out.println("Ingrese el Segundo numero: ");
        int numero2 = Integer.parseInt(lector.nextLine()) ;
        System.out.println("Ingrese el Tercer numero: ");
        int numero3 = Integer.parseInt(lector.nextLine()) ;
        
        int mayor = numero1;
        if(numero2 > mayor){
            mayor = numero2;
        }
        if(numero3 > mayor){
            numero3 = mayor;
        }
  
        System.out.println("El numero mayor es "+mayor);
        
        /*
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero "+numero1+" es mayor que "+numero2+" y "+numero3);
        }else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero "+numero2+" es mayor que "+numero1+" y "+numero3);
        }else if(numero3 > numero1 && numero3 > numero2){
            System.out.println("El numero "+numero3+" es mayor que "+numero1+" y "+numero2);
        }else{
            System.out.println("Los numero son iguales");
        }
*/
    }
}
