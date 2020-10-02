
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
public class PaintJobEstimator {
    
    public static void main(String[] args) {
        
        
        Scanner keyboard = new Scanner(System.in);
        
        // Converts swuare feet to gallons required
        double squareFeetToGallons = 0.00869565217;
        double costOfPaint = 0;
        
        // Labor wages
        double laborPerHour = 18;
        double laborCharges = 0;
        
        // Hours of labor required
        double laborInHoursRequired = 0.0695652174;
        
        // Get total square feet of paint needed
        System.out.println("Enter the square feet total of the walls that need to be painted:");
        double totalSquareFeet = keyboard.nextDouble();
        
        //Get the number of rooms to be painted 
        System.out.println("Enter the amount of rooms needed to be painted:");
        double numberOfRooms = keyboard.nextDouble();
        
        //Get price of paint per gallon from user
        System.out.println("Enter the price of a gallon of paint:");
        double pricePerGallon = keyboard.nextDouble();
        
        
        
        System.out.println("The gallons of paint needed for this job is: " + calcGallonsOfPaint(squareFeetToGallons, totalSquareFeet));
        System.out.println("The number of labor hours required for this job is: " + calcLaborHoursRequired(laborInHoursRequired, totalSquareFeet));
        System.out.println("The cost for paint for this job is: " + calcCostOfPaint(pricePerGallon, totalSquareFeet));
        System.out.println("The cost for labor for this job is: " + calcLaborCharges(totalSquareFeet, laborInHoursRequired, laborPerHour, laborCharges));
        System.out.println("The total cost of the job is: " + calcTotalCostOfJob(laborCharges, pricePerGallon, totalSquareFeet, laborPerHour, laborInHoursRequired, costOfPaint));
  
    }
    
    // Calculates gallons of paint required
    public static double calcGallonsOfPaint(double squareFeetToGallons, double totalSquareFeet) {
        double gallonsOfPaint = totalSquareFeet * squareFeetToGallons;
        return Math.ceil(gallonsOfPaint);
    }
    
    // Calc hours of labor required
    public static double calcLaborHoursRequired(double laborInHoursRequired, double totalSquareFeet) {
        double totalLabor = totalSquareFeet * laborInHoursRequired;
        return Math.floor(totalLabor);
    }
    
    // Calc cost of the paint 
    public static double calcCostOfPaint(double pricePerGallon, double totalSquareFeet) {
        return Math.ceil(pricePerGallon * (0.00869565217 * totalSquareFeet));
    }
    
    // Calc labor charges
    public static double calcLaborCharges(double totalSquareFeet, double laborInHoursRequired, double laborPerHour, double laborCharges) {
        double totalLabor = totalSquareFeet * laborInHoursRequired; 
        laborCharges = Math.ceil(laborPerHour * totalLabor);
        return laborCharges;
    }
        
    // Calc total cost of job
    public static double calcTotalCostOfJob(double laborCharges, double pricePerGallon, double totalSquareFeet, double laborPerHour, double laborInHoursRequired, double costOfPaint) {
        double totalLabor = totalSquareFeet * laborInHoursRequired; 
        laborCharges = laborPerHour * totalLabor;
        costOfPaint = pricePerGallon * (0.00869565217 * totalSquareFeet);
      
        return Math.ceil(laborCharges + costOfPaint);
    }
    
}
