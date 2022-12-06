
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class LoaiBoSoNguyen {
    public static boolean check(String x){
        if(x.length()>=10) return false;
        for (char c : x.toCharArray()){
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) throws FileNotFoundException {
        
            
            File file =new File("DATA.in");
            Scanner sc=new Scanner(file);
            ArrayList<String> ls = new ArrayList<>();
            while(sc.hasNext()){
                String token=sc.next();
                if(!check(token)){
                    ls.add(token);
                }
            }
            Collections.sort(ls);
            for(String x: ls){
                System.out.print(x+" ");
            }
            sc.close();
        
        
    }
}
