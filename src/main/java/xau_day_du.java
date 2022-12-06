/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class xau_day_du {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print((int)'a');
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            int[] a = new int[27];
            int cnt = 0;
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < s.length(); i++){
                a[(int)s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < 26; i++) {
                if(a[i] == 0) cnt++;
            }
            if(cnt <= k) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
