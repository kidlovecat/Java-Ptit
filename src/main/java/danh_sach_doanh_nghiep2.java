/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class dn{
    private String ma,ten;
    private int soSv;
    public dn(String ma,String ten,int sosv){
        this.ma = ma;
        this.ten = ten;
        this.soSv = sosv;
    }
    public String getMa(){
        return ma;
    }
    public int getSoSv(){
        return soSv;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+soSv;
               
    }
}
public class danh_sach_doanh_nghiep2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dn> ls = new ArrayList<>();
        
        while(t-- > 0){
            ls.add(new dn(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparing(dn::getSoSv).reversed().thenComparing(dn::getMa));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(dn x: ls){
                if(x.getSoSv() >= a && x.getSoSv() <= b) System.out.println(x);
            }
        }
                
    }
}
