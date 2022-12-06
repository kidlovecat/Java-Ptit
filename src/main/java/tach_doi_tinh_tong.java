/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.math.BigInteger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class tach_doi_tinh_tong {

    public static void main(String[] args){
        try{
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                while(s.length() > 1){
                                       
                    int id = s.length()/2;
                    BigInteger s1 = new BigInteger(s.substring(0,id));
                    BigInteger s2 = new BigInteger(s.substring(id,s.length()));
                    s = String.valueOf(s1.add(s2));
                    
                    System.out.println(s);
                }
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
