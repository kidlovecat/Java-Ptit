/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class chia_het_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String s = sc.nextLine();
            int sum = 0;
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0) sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                else sum -= Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            if(sum % 11 == 0) System.out.println(1);
            else System.out.println(0);
            t--;
        }
    }
}
