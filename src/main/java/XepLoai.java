/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Sv{
    private String ma,ten;
    private double p1,p2,p3;
    private int xh;
    public Sv(int i, String s , String p1, String p2, String p3){
        this.ma = "SV"+String.format("%02d",i);
        s = s.trim().toLowerCase();
        String[] token = s.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.ten = res;
        this.p1 = Double.parseDouble(p1);
        this.p2 = Double.parseDouble(p2);
        this.p3 = Double.parseDouble(p3);
    }
    public String getXH(){
        if(getDiem() >= 8) return "GIOI";
        else if(getDiem() >= 6.5) return "KHA";
        else if(getDiem() >= 5) return "TRUNG BINH";
        else return "KEM";
        
    }
    public String getMa(){
        return ma;
    }
    public Double getDiem(){
        return (double)(p1*25/100+p2*35/100+p3*40/100);
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+String.format("%.2f", getDiem())+" " +getXH();
    }
}
public class XepLoai {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("BANGDIEM.in");
        Scanner sc =  new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sv> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new Sv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
//        Collections.sort(ls,Comparator.comparingDouble(Sv::getDiem).reversed());
        Collections.sort(ls,Comparator.comparingDouble(Sv::getDiem).reversed());
        
        for(Sv x:ls) System.out.println(x);
    }
}
