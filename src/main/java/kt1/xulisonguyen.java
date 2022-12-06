/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class xulisonguyen {
    private int n;
    private int[] a = new int[20];
    public void in(){
        for(int i = 1; i<=n;i++){
            System.out.print(a[i]);
            
        }
        System.out.println();
    }
    public void Try(int i,boolean used[]){
        for(int j = 1; j <= n; j++){
            if(!used[j]){
                this.a[i] = j;
                used[j]= true;
                if(i==this.n) in();
                else Try(i+1,used);
                used[j] = false;
            }
        }
    }
    public xulisonguyen(int n){
        this.n = n;
    }
    public xulisonguyen(){
        
    }
    public void Nhap(int n){
        this.n = n;
    }
    public void In1(){
        for(int i = 0; i <= n; i++){
            if(i %6 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public void In2(){
        boolean[] used = new boolean[20];
        Try(1,used);
    }
}
