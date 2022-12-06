/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class KhachHang{
    private String ma,ten,gt,ns,dc;
    public KhachHang(int ma,String ten,String gt,String ns,String dc){
        this.ma = "KH"+String.format("%03d", ma);
        this.ten = ten;
        //chuan hoa ngay sinh
        if(ns.charAt(1) == '/') ns = "0" + ns;
        if(ns.charAt(4) == '/') ns = ns.substring(0,3) + "0" + ns.substring(3);
        this.ns = ns;
        //chuan hoa ten
        ten = ten.trim().toLowerCase();
        String[] tokens = ten.split("\\s+");
        String tmp ="";
        for(String x:tokens){
            tmp =tmp+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.ten = tmp.substring(0,tmp.length()-1);
        this.gt = gt;
        this.dc = dc;
    }
    public String getDay(){
        return ns.substring(0,2);
    }
    public String getMonth(){
        return ns.substring(3,5);
    }
    public String getYear(){
        return ns.substring(6);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gt+" "+dc+" "+ns;
    }
}
public class DanhSachKhachHang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            ls.add(new KhachHang(i,ten,gt,ns,dc));
        }
        Collections.sort(ls,Comparator.comparing(KhachHang::getYear).thenComparing(KhachHang::getMonth).thenComparing(KhachHang::getDay));
        for(KhachHang x: ls){
            System.out.println(x);
        }
    }
}
