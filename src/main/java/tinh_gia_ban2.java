/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class mh{
    private String ten,dv,tt;
    private double gnhap,sl;
    public mh(int i,String ten, String dv, double gnhap, double sl) {
        this.tt = "MH"+String.format("%02d", i);
        this.ten = ten;
        this.dv = dv;
        this.gnhap = gnhap;
        this.sl = sl;
    }
    public double getPhivc(){
        return gnhap*sl*5.0/100;
    }
    public double getTT(){
        return gnhap*sl+getPhivc();
    }
    public int getGbanle(){
        int tmp = Integer.parseInt(String.format("%d", Math.round((getTT()+getTT()*2.0/100)/sl)));
        int rounded = ((tmp + 99) / 100 ) * 100;
        return rounded;
    }
    @Override
    public String toString(){
        return tt+" "+ten+" "+dv+" "+ String.format("%d", Math.round(getPhivc()))+" "+String.format("%d", Math.round(getTT()))+" "+getGbanle();
    }
}
public class tinh_gia_ban2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<mh> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ten  = sc.nextLine();
            String dv  = sc.nextLine();
            double gnhap  = Double.parseDouble(sc.nextLine());
            double sl = Double.parseDouble(sc.nextLine());
            ls.add(new mh(i,ten,dv,gnhap,sl));
        }
        Collections.sort(ls,Comparator.comparingInt(mh::getGbanle).reversed());
        for(mh x: ls ) System.out.println(x);
    }
}
