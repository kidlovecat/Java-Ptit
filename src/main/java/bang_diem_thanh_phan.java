/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class sv{
    private String ma,ten,lop;
    private double p1,p2,p3;
    private int tt ;
    public sv(int i,String ma, String ten, String lop, double p1,double p2,double p3) {
        this.tt = i;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getLop() {
        return lop;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    @Override
    public String toString(){
        return  ma+ " " + ten + " " + lop+ " " + String.format("%.1f %.1f %.1f", p1,p2,p3);
    }
}
public class bang_diem_thanh_phan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<sv>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            Double p1 = Double.parseDouble(sc.nextLine());
            Double p2 = Double.parseDouble(sc.nextLine());
            Double p3 = Double.parseDouble(sc.nextLine());
            
          
            a.add(new sv(i,ma,ten,lop,p1,p2,p3));
        }
        Collections.sort(a,Comparator.comparing(sv::getTen));
        int cnt=1;
        for(sv x: a) {
            System.out.println(cnt+" "+x);
            cnt++;
        }
    }
}
