/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class Point {
    private double x;
    private double y;
    public Point(){
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        double distanceX = secondPoint.x - this.x;
        double distanceY = secondPoint.y - this.y;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
    }
     public double distance(Point p1,Point p2){
        double distanceX=p1.x-p2.x;
        double distanceY=p1.y-p2.y;
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }
    @Override
    public String toString(){
        return "1";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ca = c.distance(a);
            
            if(ab + bc <= ca || ab + ca <= bc || bc + ca <= ab) System.out.println("INVALID");
            else{
                double sum = (0.25)*Math.sqrt((ab+bc+ca)*(ab+bc-ca)*(ab-bc+ca)*(bc-ab+ca));
                double R = (0.25 * ab*bc*ca)/(double)sum;
                double res = Math.pow(R, 2)*Math.PI;
                System.out.format("%.3f", res);
                System.out.println();
            }
        }
    }
}
