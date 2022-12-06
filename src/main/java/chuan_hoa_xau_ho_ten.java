/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class chuan_hoa_xau_ho_ten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String s = sc.nextLine();
            while(s.charAt(0) == ' ' && s.isEmpty() == false) {
                s = s.substring(1,s.length());
            }
            String[] words = s.split(" ");
            for(String w: words){
                String tmp = w;
                if(w.isEmpty() == false)
                    w = tmp.substring(0,1).toUpperCase()+ tmp.substring(1).toLowerCase();
                System.out.print(w+" ");
             
            }
            System.out.println();
            t--;
        }
        
    }
}
