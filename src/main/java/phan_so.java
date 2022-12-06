/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class phan_so {
    private long tu;
    private long mau;
    public phan_so(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public long gcd(){
        while(tu * mau != 0){
            if(tu > mau) tu%=mau;
            else mau%=tu;
        }
        return tu+mau;
    }
    
    public String getAns(){
        long a = tu, b = mau;
        return (a/gcd()+"/"+(b/gcd()));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            
        
            long t = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            phan_so a = new phan_so(t,m);
            phan_so b = new phan_so(x,y);
            long tuC = t*y+x*m;
            long mauC = m*y;
            phan_so c = new phan_so(tuC*tuC,mauC*mauC);
            long tuD = a.getTu()*b.getTu()*c.getTu();
            long mauD = a.getMau()*b.getMau()*c.getMau();
            phan_so d = new phan_so(tuD,mauD);
            System.out.println(c.getAns()+" "+d.getAns());
        }
    }
}
