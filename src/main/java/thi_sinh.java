/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class thi_sinh {
    private String name,id;
    private float p1,p2,p3;
    public thi_sinh(String id, String name, float p1, float p2, float p3){
        this.name = name;
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getKV(){
        if(id.substring(0,3).compareTo("KV1") == 0) return 0.5;
        if(id.substring(0,3).compareTo("KV2") == 0) return 1;
        return 2.5;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public float getP1(){
        return p1;
    }
    public float getP2(){
        return p2;
    }
    public float getP3(){
        return p3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        thi_sinh a = new thi_sinh(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.print(a.getId()+" "+a.getName()+" ");
        if(a.getKV() == 1) System.out.print("1 ");
        else System.out.format("%.1f ", a.getKV());
        float sum = 2*a.getP1()+a.getP2()+a.getP3();
        if(sum - (int)sum != 0)System.out.format("%.1f ",sum);
        else System.out.print((int)sum+" ");
        if(a.getKV() + sum >=24) System.out.print("TRUNG TUYEN");
        else System.out.print("TRUOT");
    }
}
