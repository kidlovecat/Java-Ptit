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
class Ts{
    private String ma,ten,dtoc,kv;
    private double diem;
    public Ts(int i, String ten,String diem,String dtoc,String kv){
        this.ma = "TS"+String.format("%02d", i);
        ten = ten.trim().toLowerCase();
        String[] token = ten.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.ten = res;
        this.ten = res;
        this.diem = Double.parseDouble(diem);
        this.kv = kv;
        this.dtoc = dtoc;
    }
    public String getMa(){
        return ma;
    }
    public double getSum(){
        double sum = diem;
        if(kv.equals("1")) sum += 1.5;
        else if(kv.equals("2")) sum += 1;
        if(!dtoc.equals("Kinh")) sum += 1.5;
        return sum;
    }
    public String getTT(){
        if(getSum() >= 20.5) return "Do";
        else return "Truot";
    }
    @Override
    public String toString(){
        return ma+" "+ten+String.format("%.1f", getSum())+" "+getTT();
    }
}
public class DiemTiuyenSinh {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ts> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new Ts(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(Ts::getSum).reversed().thenComparing(Ts::getMa));
        for(Ts x:ls) System.out.println(x);
    }
}
