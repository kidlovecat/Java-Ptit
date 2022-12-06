/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class day_con_lien_tuc_co_tong_bang_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            int[] a = new int[100001];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            long sum = a[0];
            int l = 0, r = 0, kt = 0;
            for(int i = 1; i < n; i++){
                sum += a[i];
                while(sum > k && l < i){
                    sum -= a[l]; l++;
                }
                if(sum == k){
                    kt = 1;
                    break;
                }
            }
            if(kt == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
