/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects4to11;

/**
 *
 * @author mustafa
 */
public class CompareTwoNumbers {
    private int a;
    private int b;
    
    CompareTwoNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String compare(){        
        String result;
        if(a<b)
            result = "A("+a+") < B("+b+")";
        else if(a>b)
            result = "A("+a+") > B("+b+")";
        else
            result = "A("+a+") == B("+b+")";
        
        return result;
    }    
}
