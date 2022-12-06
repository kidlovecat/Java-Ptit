/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class MH{
    private String ma,ten,dv;
    private long gMua,gBan,tt;

    public MH(long tt,String ten, String dv, long gMua, long gBan){
        
        this.tt = tt;
        this.ten = ten;
        this.dv = dv;
        this.gBan = gBan;
        this.gMua = gMua;
        this.ma = "MH" +String.format("%03d", tt);
        
    }
    public long getTT(){
        return tt;
    }
    public long getLai(){
        return gBan - gMua;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + dv + " " + gMua + " " + gBan + " " + getLai();
    }
}
public class danh_sach_mat_hang {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MH> ls = new ArrayList<>();
        long n = 1;
        while(t-- > 0){
            ls.add(new MH(n,sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
            n++;
        }
        Collections.sort(ls,Comparator.comparingLong(MH::getLai).reversed().thenComparingLong(MH::getTT));
        for(MH x: ls){
            System.out.println(x);
        }
    }
}
