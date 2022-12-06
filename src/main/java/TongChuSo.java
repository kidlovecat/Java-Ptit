
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class TongChuSo {
    public static String convertToDec(String s){
        String tmp="";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                tmp = tmp + String.valueOf(s.charAt(i));
            }
        }
        while(tmp.charAt(0) == '0'){
            if(tmp.charAt(0) == '0' && tmp.length() == 1) return "";
            tmp = tmp.substring(1);
        }
        return tmp;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ls = (ArrayList<String>) sc.readObject();
        for(String s: ls){
            String x = convertToDec(s);
            long res = 0;
            for(int i = 0; i < x.length(); i++){
                res +=  Integer.parseInt(String.valueOf(x.charAt(i)));
            }
            System.out.println(x +" "+ res);
        }
    }
}
