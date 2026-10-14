/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Circle {
    // Private Variables
    private double radius;
    private String color;
    
    // Construct (overloaded)
    public Circle() {
        radius = 1.0; // 1st Constructor
        color = "red";
    }
    public Circle(double r) {  // 2nd Constructor
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) { // 3rd Constructor
        radius = r;
        color = c;
    }
    
// Public Method
 public double getRadius(){
    return radius;
 }
public String getColor() {
    return color;
}
public double getArea() {
 return radius*radius*Math.PI;
}
}

