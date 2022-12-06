
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class DocFileVanBan {
    public static boolean check(String x){
        if(x.length()>=10) return false;
        for (char c : x.toCharArray()){
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    
    }
    public static void main(String[] args) throws FileNotFoundException{
        try{
            long sum=0;
            File file =new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String token=sc.next();
                if(check(token)){
                    sum+=Integer.parseInt(token);
                }
            }
            System.out.println(sum);
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
