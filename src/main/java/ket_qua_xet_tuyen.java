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
class ts{
    private String ma,ten,ns;
    private double lt,th;
    public ts(int i,String s,String ns,double lt,double th){
        this.ma = "PH"+String.format("%02d", i);
        s = s.trim().toLowerCase();
        String[] token = s.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.ten = res;
        this.ns = ns;
        this.lt = lt;
        this.th = th;
    }
    public int getTuoi(){
        return 2021-Integer.parseInt(ns.substring(ns.length()-4));
    }
    public int getDiem(){
        if(lt >= 8 && th >= 8){
            double diem = Math.round((lt+th)/2)+1;
            if(diem >= 10 ) return 10;
            else return (int)diem;
        }
        else if(lt >= 7.5 && th >= 7.5){
            return (int)(Math.round((lt+th)/2)+0.5);
        }
        return (int)Math.round((lt+th)/2);
    }
    public String getXL(){
        if(getDiem() >= 9) return "Xuat sac";
        if(getDiem() >= 8) return "Gioi";
        if(getDiem() >= 7) return "Kha";
        if(getDiem() >= 5) return "Trung binh";
        return "Truot";
    }
    @Override
    public String toString(){
        return ma+" "+ten+getTuoi()+" "+getDiem()+" "+getXL();
    }
}
public class ket_qua_xet_tuyen {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("XETTUYEN.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine());
            double th = Double.parseDouble(sc.nextLine());
            ls.add(new ts(i,ten,ns,lt,th));
        }
        for(ts x:ls) System.out.println(x);
    }
}
