/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class so_xa_cach {
    static int n = 0;
    static int[] a = new int[20];
    static int[] vs = new int[20];
    static void xuat(){
        boolean check = true;
        String res = "";
        for(int i=1;i<n;i++){
            res+=String.valueOf(a[i]);
            if(Math.abs(a[i]-a[i+1])==1) {
                check =false;
                break;
            }
        }
        res+=String.valueOf(a[n]);
        if(check)
            System.out.println(res);
    }
    static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(vs[j] == 0){
                vs[j] = 1;
                a[i] = j;
                if(i == n) xuat();
                else Try(i+1);
                vs[j] = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            n = sc.nextInt();
            for(int i = 0; i < 20 ; i++) vs[i] = 0;
                
            Try(1);
            t--;
        }
    }
}
