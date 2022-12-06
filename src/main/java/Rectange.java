/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange(){
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return height*width;
    }
    public double findPerimeter(){
        return 2*(height+width);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        String color=sc.next().toLowerCase();
        color=String.valueOf(color.charAt(0)).toUpperCase()+color.substring(1);
        Rectange hcn=new Rectange(width,height,color);
        if(height>0&&width>0)
            System.out.println((int)hcn.findPerimeter()+" "+(int)hcn.findArea()+" "+hcn.getColor());      
        else System.out.println("INVALID");
    }
    
}

