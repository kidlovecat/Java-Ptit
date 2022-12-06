/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> st = new HashSet<String>();
        
        for(int i = 0; i < s.length(); i++) st.add(String.valueOf(s.charAt(i)));
        
        System.out.print(st.size());
        
    }
}
