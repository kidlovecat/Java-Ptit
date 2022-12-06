/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class boi_so_nho_nhat_n_so_dau {
    public static long BSC(long a,long b){
        long res=a*b;
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return res/(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            long BSNN =1;
            long n=sc.nextLong();
            for(long j=1;j<=n;j++)
            BSNN=BSC(BSNN,j);
            System.out.println(BSNN);
        }
    }
}
