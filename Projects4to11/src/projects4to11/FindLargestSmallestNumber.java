/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects4to11;

/**
 *
 * @author mustafa
 */
public class FindLargestSmallestNumber {

    private int[] numbers;

    FindLargestSmallestNumber(int[] numbers) {
        this.numbers = numbers;
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");
    }

    public void findLargest() {
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("\nThe Largest number is: " + largest);
    }

    public void findSmallest() {
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest number is: " + smallest);
    }
}
