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

    public sv(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getma() {
        return ma;
    }
    public String toTring(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
}
public class sap_xep_theo_ma_sv {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<sv>a=new ArrayList<>();
        while(sc.hasNext()){
            sv sv=new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(sv);
        }
        Collections.sort(a, Comparator.comparing(sv::getma));
        for(sv x:a){
            System.out.println(x.toTring());
        }
    }
}
