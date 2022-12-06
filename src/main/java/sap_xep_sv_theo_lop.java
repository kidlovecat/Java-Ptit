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
    private String ma,ten,lop,mail;
    public sv(String m,String t,String l, String e){
        this.ma = m;
        this.ten = t;
        this.lop = l;
        this.mail = e;
    }
    public String getMa(){
        return ma;
    }
    public String getLop(){
        return lop;
    }
//    public int getMa(){
//        return Integer.parseInt(ma.substring(7));
//    }
//    public int getLop(){
//        return Integer.parseInt(ma.substring(1,3));
//    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
}
public class sap_xep_sv_theo_lop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(sv::getLop).thenComparing(sv::getMa));
        for(sv x:ls) System.out.println(x);
    }
}
