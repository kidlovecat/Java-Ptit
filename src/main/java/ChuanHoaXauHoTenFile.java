/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ChuanHoaXauHoTenFile {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("DANHSACH.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            s = s.trim().toLowerCase();
            String[] token = s.split("\\s+");
            String res="";
            for(String x:token){
                res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
            }
            System.out.println(res);
        }
        
    }
}
