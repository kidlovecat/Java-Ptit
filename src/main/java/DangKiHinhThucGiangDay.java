
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
class Mh{
    private String ma, ten, ht1,ht2;
    private int sotc;
    public Mh(String ma,String ten,int sotc,String ht1,String ht2){
        this.ma = ma;
        this.ten = ten;
        this.sotc = sotc;
        this.ht1 = ht1;
        this.ht2 = ht2;
    }
    public String getHT2(){
        return ht2;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma +" "+ten+" "+sotc+" "+ht1+" "+ht2;
    }
}
public class DangKiHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Mh> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new Mh(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(Mh::getMa));
        for(Mh x: ls) {
            if(x.getHT2().equals("Truc tuyen") || x.getHT2().contains(".ptit.edu.vn")){
                System.out.println(x);
            }
        }
        
    }
}
