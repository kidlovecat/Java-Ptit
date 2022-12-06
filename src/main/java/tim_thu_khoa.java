/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class ts {
    private String name,bir;
    private double p1,p2,p3;
    private int tt;
    public ts(int tt, String name, String bir, double p1, double p2, double p3){
        this.name = name;
        this.tt = tt;
        this.bir = bir;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getName(){
        return name;
    }
    public String getBir(){
        return bir;
    }
    public double getP1(){
        return p1;
    }
    public double getP2(){
        return p2;
    }
    public double getP3(){
        return p3;
    }
    public double getP(){
        return p1+p2+p3;
    }
    @Override
    public String toString(){
        return String.valueOf(tt) +" "+name+" "+bir+" "+ String.format("%.1f",getP());
    }
}
public class tim_thu_khoa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String name = sc.nextLine();
            String birth = sc.nextLine();
            double p1 = Double.parseDouble(sc.nextLine());
            double p2 = Double.parseDouble(sc.nextLine());
            double p3 = Double.parseDouble(sc.nextLine());
            ts a = new ts(i,name,birth,p1,p2,p3);
            ls.add(a);
        }
        double maxx = 0;
        for(ts x: ls){
            if(x.getP() > maxx) maxx = x.getP();
        }
        for(ts x: ls){
            if(x.getP() == maxx) System.out.println(x);
        }
    }
}
