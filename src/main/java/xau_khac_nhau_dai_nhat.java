/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class xau_khac_nhau_dai_nhat {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String a =sc.nextLine();
            String b =sc.nextLine();
            if(a.compareTo(b) == 0) System.out.println(-1);
            else {
                if(a.length() > b.length()) System.out.println(a.length());
                else System.out.println(b.length());
            }
        }
    }
}
