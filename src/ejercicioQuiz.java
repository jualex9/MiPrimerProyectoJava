import java.util.Scanner;

public class EjercicioQuiz
{
   public static void main(String[] args)
   {
    Scanner input =new Scanner(System.in);
         System.out.println("ingrese su numero");
       int numero = input.nextInt();
       System.out.println("el numero" + numero);
       if (numero >0) {
        for ( int k=1; k<=numero; k++) {
           for (int i=1; i<=k; i++) {
            if ( i% 2 == 1) {                
                System.out.print(k);
            } else {
                System.out.print(k*-1);
            }
        if(i<k) {
            System.out.print(" ");
            
        }
 }
        System.out.println();
        }
        input.close();
    } else {
        System.out.println("numero no valido");
        input.close();
       
        return;
       

    }    
}
       }
    

   




