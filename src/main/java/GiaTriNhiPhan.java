/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
import java.io.*;
public class GiaTriNhiPhan {
    public static String convertToBin(String s){
        String tmp="";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '1'){
                tmp = tmp + String.valueOf(s.charAt(i));
            }
        }
        return tmp;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ls = (ArrayList<String>) sc.readObject();
        for(String s: ls){
            String x = convertToBin(s);
            long res = 0;
            for(int i = 0; i < x.length(); i++){
                res += Math.pow(2, x.length()-i-1)* Integer.parseInt(String.valueOf(x.charAt(i)));
            }
            System.out.println(x +" "+ res);
        }
    }
}
