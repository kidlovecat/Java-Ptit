/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;

public class xep_hang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] t = new int[101];
        int[] d = new int[101];
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            t[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(t[i] > t[j]){
                    int tmp = t[i]; t[i] = t[j]; t[j] = tmp;
                    tmp = d[i]; d[i] = d[j]; d[j] = tmp;
                }
            }
        }
        int res = t[0]+d[0];
        for(int i = 1; i < n; i++){
            if(res < t[i]) {
                res = t[i];
                res += d[i];
            }
            else if(res > t[i]) res += d[i];                       
            
        }
        System.out.print(res);
    }
}
