/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class lua_chon_tham_lam {
    static int n ;
    static String copyString(int x,String s){
        String tmp="";
        for(int i = 0; i < x; i++) tmp+=s;
        return tmp;
    }
    static String MinNum(String s, int k){
        String res = "";
        int cnt = k/9;
        String tmp = "";
        
        if(cnt == n-1) res = String.valueOf(k%9) + copyString(cnt,"9");
        else{
            k--;
            res = "1" + copyString(n-2-cnt,"0")+ String.valueOf(k % 9) + copyString(cnt,"9");
        }
        return res;
    }
    static String MaxNum(String s, int k){
        String res = "";
        while(n > 0){
            if(k >= 9){
                res += "9";
                k -= 9;
            }else{
                res += String.valueOf(k);
                k = 0;
            }
            n--;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kt = 0;
        String maxx="", minn="";
        n =sc.nextInt();
        int k = sc.nextInt();
        if(k != 0 && n*9 >= k){
            minn = MinNum(minn,k);
            maxx = MaxNum(maxx,k);
            kt = 1;
        }
        if(kt == 0) System.out.println("-1 -1");
        else System.out.println(minn + " " + maxx);
    }
}
