/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class tong_pso {
    private long tu;
    private long mau;
    public tong_pso(){
        this.tu =1;
        this.mau = 1;
    }
    public tong_pso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
        
    }
    public tong_pso congPS(tong_pso a, tong_pso b){
        tong_pso res = new tong_pso();
        this.tu = a.tu * b.mau + b.tu * a.mau;
        this.mau = a.mau*b.mau;
        res.tu = this.tu;
        res.mau = this.mau;
        return res;
    }
    public long gcd(){
        while(tu * mau != 0){
            if(tu > mau) tu%=mau;
            else mau%=tu;
        }
        return mau+tu;
    }
    @Override
    public String toString(){
        long a = tu;
        long b = mau;
        return ((a/gcd())+"/"+(b/gcd()));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        tong_pso a = new tong_pso(sc.nextLong(),sc.nextLong());
        tong_pso b = new tong_pso(sc.nextLong(),sc.nextLong());
        tong_pso c = new tong_pso();
        c.congPS(a,b);
//        System.out.print(c.tu + " " +c.mau);
        System.out.println(c.toString());
    }
}
