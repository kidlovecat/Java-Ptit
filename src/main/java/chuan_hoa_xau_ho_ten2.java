/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;

public class chuan_hoa_xau_ho_ten2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] words = s.split(" ");
            for(int i = 0; i < words.length; i ++){
                if(words[i].isEmpty() == false){
                    String tmp = words[i];
                    words[i] = tmp.substring(0,1).toUpperCase() + tmp.substring(1);
                }
            }
            for(int i = 1; i < words.length-1; i++){
                System.out.print(words[i] + " ");
            }
            System.out.print(words[words.length-1]);
            System.out.println(", " + words[0].toUpperCase());
            t--;
        }
    }
}
