
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class IsEven {
    
    private static int randomNumbers = 100;

    
    
    
      public static boolean isEven(int num) {
    
        boolean evenNumber = false;

        if ((num % 2) == 0) {
            evenNumber = true;
         }
        return evenNumber;
    
        }
    
    
    public static void main(String[] args) {
        
        
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        Random randomNumber = new Random();
        
        
        for (int i =1; i <= randomNumbers; i++){
            if (isEven(randomNumber.nextInt(i))) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            
        }
        
        
        System.out.println("The number of even numbers generated: " + evenNumbers);
        System.out.println("The number of odd numbers generated: " + oddNumbers);
        
        
        
    }
    
}
