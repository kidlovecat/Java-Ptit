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
class nhan_vien {
    private String tt;
    private String name;
    private String sex;
    private String birth;
    private String address;
 
    public nhan_vien(int tt,String ten,String sex,String birth,String add){
        ten = ten.trim().toLowerCase();
        String[] token = ten.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.name = res;
        this.sex = sex;
        if(birth.charAt(1) == '/') birth = "0" + birth;
        if(birth.charAt(4) == '/') birth = birth.substring(0,3) + "0" + birth.substring(3);
        this.birth = birth;
        this.address = add;
        
        this.tt = "KH"+String.format("%03d", tt);
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String getBirth(){
        return birth;
    }
    public String getaddress(){
        return address;
    }


    //02/02/2002
    public int getDay(){
        
        return Integer.parseInt(birth.substring(0,2));
    }
    public int getMonth(){
        
        return Integer.parseInt(birth.substring(3,5));
    }
    public int getYear(){
      
        return Integer.parseInt(birth.substring(6));
    }
 
    
    @Override
    public String toString(){
       
        
        return tt +" " + getName() + getSex() +" "+getaddress()+" " +getBirth();
    }
}
    
public class DanhSachKhachHangFile {
     public static void main(String[] args) throws FileNotFoundException{
        File f = new File("KHACHHANG.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhan_vien> ls = new ArrayList<>();
        for(int i =1; i <= t; i++){
            
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            
            nhan_vien a = new nhan_vien(i,name,sex,birth,address);
            ls.add(a);
        }
        Collections.sort(ls,Comparator.comparingInt(nhan_vien::getYear).thenComparingInt(nhan_vien::getMonth).thenComparingInt(nhan_vien::getDay));
        for(nhan_vien x: ls) System.out.println(x);
        
    }
}
