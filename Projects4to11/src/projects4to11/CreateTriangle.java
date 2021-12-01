/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects4to11;

/**
 *
 * @author mustafa
 */
public class CreateTriangle {

    private int number;

    public CreateTriangle(int number) {
        this.number = number;
    }

    public void createTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
