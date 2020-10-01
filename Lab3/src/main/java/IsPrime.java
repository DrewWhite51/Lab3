
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class IsPrime {
    
    
    
    
      public static void main(String args[]) {
          Scanner keyboard = new Scanner(System.in);
          
          System.out.println("Enter the number to find if it is prime:");
          int n = keyboard.nextInt();


      
      
      checkPrime(n);
      
     
   }
      
      static void checkPrime(int n){
          
          
            int i;
            int m = 0;
            int flag = 0;
            
            
            m = n/2;
            
            
            if(n==0||n==1){
                System.out.println(n+" is not a prime number.");
                           }
            else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        
                        System.out.println(n+" is not a prime number.");
                        flag=1;
                        break;
                        
                                }
                    
                            }
        
                    if(flag==0) { System.out.println(n+" is a prime number."); }
                    }
}
      
      
//      public static void primeCheck() {
//                
//          Scanner keyboard = new Scanner(System.in);
//
//          
//          
//         System.out.println("Enter the number to find if it is prime:");
//            
//         int n = keyboard.nextInt(); 
//         int m = 0;      
//         int i = 0;
//         int counter = 0;      
//          
//         if (n == 0 || n == 1) {
//         
//         System.out.println(n + " not a prime number");} else {
//         
//          for (i = 2; i <= m; i++) {
//            
//              
//              if (n % i == 0) {
//               System.out.println(n + " not a prime number");
//               counter = 1;
//               break;
//           
//              }
//         }
//         
//          if (counter == 0) {
//            System.out.println(n + " is a prime number");
//         }
//      }
//            
//   }
    
}
      
    

