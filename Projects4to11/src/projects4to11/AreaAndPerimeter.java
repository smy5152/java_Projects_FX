/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects4to11;

/**
 *
 * @author mustafa
 */
public class AreaAndPerimeter {
    private double radius;

    AreaAndPerimeter(double radius) {
        this. radius = radius;
    }
    
    public double calculateArea(){
        double area=0;
        try {
            area = Math.PI*radius*radius;
//            area = new DecimalFormat.("##.##").format(area));
        }catch(Exception e){
            System.out.println("Error"+e);
        }
//               String.valueOf(new DecimalFormat.("##.##").format(area)) 
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter=0;
        try {            
            perimeter = 2*Math.PI*radius;
        }catch(Exception e){
            System.out.println("Error"+e);
        }
        return perimeter;        
    }
    
    
}
