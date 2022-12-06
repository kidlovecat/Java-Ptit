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
    private String ten,ma;
    private double cu,moi;
    public KhachHang(int i,String ten,double cu,double moi){
        this.ma = "KH"+String.format("%02d", i);
        this.ten = ten;
        this.cu = cu;
        this.moi = moi;
    }
    public int getDonGia(){
        if(moi-cu > 100) return (int)Math.round((50*100+50*150+(moi-cu-100)*200)*1.05);
        else if(moi - cu > 51) return (int)Math.round((50*100+(moi-cu-50)*150)*1.03);
        else return (int)Math.round((moi-cu)*100*1.02);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+getDonGia();
    }
}
public class HoaDonDIenNuoc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            double cu = Double.parseDouble(sc.nextLine());
            double moi = Double.parseDouble(sc.nextLine());
            ls.add(new KhachHang(i,ten.trim(),cu,moi));
        }
        Collections.sort(ls,Comparator.comparingDouble(KhachHang::getDonGia).reversed());
        for(KhachHang x: ls) System.out.println(x);
    }
}
