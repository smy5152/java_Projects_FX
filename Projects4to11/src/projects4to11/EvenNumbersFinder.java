/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects4to11;

/**
 *
 * @author mustafa
 */
public class EvenNumbersFinder {
    private int evenNumbers;

    EvenNumbersFinder(int evenNumbers) {
        this.evenNumbers = evenNumbers;
    }    

    public void printEvens() {
        for(int i = 1; i<evenNumbers; i++){
            if(i%2 == 0)
                System.out.print(i+", ");
        }
    }
    
}
