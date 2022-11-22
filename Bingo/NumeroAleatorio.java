import java.util.Scanner;

public class NumeroAleatorio {

   public void NumeroAleatorio1(){
      int x;
      x = (int) (Math.random() * (90 + 1));
      System.out.println("El numero escogido es:" + x);

   }
 
   public void Mostrar(){
      Scanner sc2 = new Scanner(System.in);
      int y;
      System.out.print("Digite la cantidad de numeros para la tabla:");
      y = sc2.nextInt();
      if(y > 90){
         System.out.println("La opcion no es correcta");
      }
      else{
         for(int i=1; i<=y; i++){
            System.out.print((i +"   |   "));

            if(i == 10){
            System.out.println("\n");
            }

            else if(i == 20){
            System.out.println("\n");
            }

            else if(i == 30){
               System.out.println("\n"); 
            }

            else if(i == 40){
               System.out.println("\n"); 
            }

            else if(i == 50){
               System.out.println("\n"); 
            }

            else if(i == 60){
               System.out.println("\n"); 
            }

            else if(i == 70){
               System.out.println("\n"); 
            }

            else if(i == 80){
               System.out.println("\n"); 
            }

            else if(i == 90){
               System.out.println("\n"); 
            }
            
         }

         
      }
   }
   
   
}


