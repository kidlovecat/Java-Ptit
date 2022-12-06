/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrabuoi1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class XuLiDaySoThuc {
    private double[] a ;
    public XuLiDaySoThuc(double[] a){
        this.a = a;
    }
    public XuLiDaySoThuc(){
   
    }
    public void Nhap(Scanner sc,int n){
        double[] tmp = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"]: ");
            tmp[i] = Double.parseDouble(sc.nextLine());
        }
        this.a = tmp;
    }
    public double getTong(){
        double sum = 0;
        for(int i = 0;i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public void SapXep(){
        double[] tmp = this.a;
        Arrays.sort(tmp);
        for(double i:tmp){
            System.out.print(i);
        }
        System.out.println();
    }
}

