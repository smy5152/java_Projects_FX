/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projects4to11;
import java.util.*;
/**
 *
 * @author mustafa
 */
public class Projects4to11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        // COMPARE TWO NUMBERS
        int a = 27, b = 28;
        CompareTwoNumbers comparison = new CompareTwoNumbers(a, b);
        System.out.println("Comparison of Two Numbers: " + comparison.compare());

        //CALCULATE AREA & PERIMETER OF A CIRCLE
        double radius = 10;
        AreaAndPerimeter calculate = new AreaAndPerimeter(radius);
        System.out.println("Area for radius: " + radius + "cms is: " + calculate.calculateArea());
        System.out.println("Perimeter for radius: " + radius + "cms is: " + calculate.calculatePerimeter());

        try {
            System.out.println("____________\nUsing User Input\n____________");
            System.out.println("Enter the Radius:");
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            AreaAndPerimeter userCalculate = new AreaAndPerimeter(Double.parseDouble(bReader.readLine()));
            System.out.println("Area:" + userCalculate.calculateArea());
            System.out.println("Perimeter:" + userCalculate.calculatePerimeter());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error:" + e);
        }

        //CREATE A TRIANGLE
        try {
            System.out.println("____________\nCreate A Triangle\n____________");
            System.out.println("Enter a Number:");
            BufferedReader bReader2 = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(bReader2.readLine());
            CreateTriangle draw = new CreateTriangle(count);
            draw.createTriangle();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error" + e);
        }

        //Find Even Numbers
        try {

            System.out.println("____________\nEven Numbers\n____________");
            System.out.println("Enter a Number: ");
            BufferedReader bReader3 = new BufferedReader(new InputStreamReader(System.in));
            int evens = Integer.parseInt(bReader3.readLine());
            EvenNumbersFinder even = new EvenNumbersFinder(evens);
            //even.printEvens();

        } catch (Exception e) {
            System.out.println("Error" + e);

        }
         
        //Check Leap Year
        int year = 2004;
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
         

        //Generate Prime Numbers
        try {
            System.out.println("____________\nPrime Numbers\n____________");
            System.out.println("Enter a Number: ");
            BufferedReader bReader4 = new BufferedReader(new InputStreamReader(System.in));
            int primes = Integer.parseInt(bReader4.readLine());
            for (int i = 1; i <= primes; i++) {
                if(i%2==0 | i%3==0 | i%5==0)
                    ;
                else
                    System.out.print(i+", ");
            }
            System.out.println();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error" + e);
        }        
        
        //FIND LARGEST NUMBER
        System.out.println("____________\nLargest Numbers\n____________");        
        int[] numbers = {-1, 10,15,5,25,0,99,1};
        FindLargestSmallestNumber find = new FindLargestSmallestNumber(numbers);
        find.findLargest();
        find.findSmallest();

        */
        
        //RANDOM NUMBER GENERATOR
        int max=50;
        
        Random randomNum = new Random();
        for (int i=0; i<10; i++){
            System.out.print(randomNum.nextInt(max)+" ");
        }
        
    }
}
