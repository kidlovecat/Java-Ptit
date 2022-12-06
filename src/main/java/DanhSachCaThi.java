/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class CaThi{
    private String ma,date,time,phong;
    public CaThi(int i,String date,String time,String phong){
        this.ma = "C"+String.format("%03d",i);
        this.date = date;
        this.time = time;
        this.phong = phong;
    }
    public String getMa(){
        return ma;
    }
    public String getDay(){
        return date.substring(0,2);
    }
    public String getMonth(){
        return date.substring(3,5);
    }
    public String getYear(){
        return date.substring(6);
    }
    public String getHour(){
        return time.substring(0,2);
    }
    public String getMinute(){
        return time.substring(3,5);
    }
    @Override
    public String toString(){
       return ma + " "+date +" "+time+" "+phong; 
    }
}
public class DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("CATHI.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new CaThi(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(CaThi::getYear).thenComparing(CaThi::getMonth).thenComparing(CaThi::getDay).thenComparing(CaThi::getHour).thenComparing(CaThi::getMinute).thenComparing(CaThi::getMa));
        for(CaThi x:ls) System.out.println(x);
    }
}
