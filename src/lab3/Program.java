package lab3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    	   // Test Part 3: pounds conversion
        int pounds = getInt("Enter a weight in pounds:");
        convertInputToStonesPounds(pounds);

        // Test Part 3: kilograms conversion
        int kg = getInt("Enter a weight in kilograms:");
        convertKgsToStonesPounds(kg);

        // Use this when you want to test the lunch task:
        // theLunchQueue();
    }

    public static void theLunchQueue() {
    	Utils utils = new Utils();
        String mainCourse = utils.getString("What main dish would you like (Fish, Burgers or Veg)?");
        int roastPotatoes = utils.getInt("How many roast potatoes would you like?");
        int brusselSprouts = utils.getInt("How many Brussel sprouts would you like?");
        System.out.println("Hello, your lunch is " + mainCourse + " with " + roastPotatoes + " roast potatoes and " + brusselSprouts + " Brussel sprouts.");
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);   
        return s.nextInt();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
        
    }
    
    static void convertInputToStonesPounds(int pounds) {
    	int stones =pounds /14;
    	int remainingPounds = pounds % 14;
    	System.out.println(pounds + " pounds is "+ stones + " stones and " + remainingPounds + "pounds" );
    	
    }
    
    static void convertKgsToStonesPounds(int kg) {
    	int pounds = (int) (kg * 2.20462);
    	convertInputToStonesPounds(pounds);
    			
    }
}