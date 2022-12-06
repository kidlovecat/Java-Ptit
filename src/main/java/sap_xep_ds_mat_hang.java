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
class mh{
    private String ten,nhom;
    private double gmua,gban;
    private String tt;
    public mh(int tt, String ten,String nhom, double gmua, double gban){
        this.tt = "MH"+String.format("%02d", tt);
        this.ten = ten;
        this.nhom = nhom;
        this.gmua = gmua;
        this.gban = gban;
    }
    public double getPro(){
        return gban-gmua;
    }
    @Override 
    public String toString(){
        return tt+" "+ten+" "+nhom+" "+String.format("%.2f",getPro());
    }
}
public class sap_xep_ds_mat_hang {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("MATHANG.in");
        Scanner sc = new Scanner(f);
        int t  = Integer.parseInt(sc.nextLine());
        ArrayList<mh> ls = new ArrayList<>();
        for(int i = 1 ; i <= t; i++){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double m = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            mh a = new mh(i,ten,nhom,m,b);
            ls.add(a);
        }
        Collections.sort(ls,Comparator.comparingDouble(mh::getPro).reversed());
        for(mh x:ls) System.out.println(x);
    }
}
