/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
 import java.util.*;
class nhan_vien {
    private int tt;
    private String name;
    private String sex;
    private String birth;
    private String address;
    private String number;
    private String date;
    public nhan_vien(int tt,String name,String sex,String birth,String add,String num,String date){
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = add;
        this.number = num;
        this.date = date;
        this.tt = tt;
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
    public String getNumber(){
        return number;
    }
    public String getdate(){
        return date;
    }
    //02/02/2002
    public int getDay(){
        setBirth();
        return Integer.parseInt(birth.substring(0,2));
    }
    public int getMonth(){
        setBirth();
        return Integer.parseInt(birth.substring(3,5));
    }
    public int getYear(){
        setBirth();
        return Integer.parseInt(birth.substring(6));
    }
    public void setBirth(){
        if(birth.charAt(1) == '/') this.birth = "0" + birth;
        if(birth.charAt(4) == '/') this.birth = birth.substring(0,3) + "0" + birth.substring(3);
    }
    public void setDate(){
        if(date.charAt(1) == '/') this.date = "0" + date;
        if(date.charAt(4) == '/') this.date = birth.substring(0,3) + "0" + date.substring(3);
    }
    @Override
    public String toString(){
        setBirth();
        setDate();
        return String.format("%05d", tt) +" " + getName() +" "+ getSex() +" " +getBirth()+" "+getaddress() + " "+ getNumber()+" "+getdate();
    }
}
    
public class danh_sach_doi_tuong_nhan_vien {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nhan_vien> ls = new ArrayList<>();
        for(int i =1; i <= t; i++){
            
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            String number = sc.nextLine();
            String date = sc.nextLine();
            nhan_vien a = new nhan_vien(i,name,sex,birth,address,number,date);
            ls.add(a);
        }
        Collections.sort(ls,Comparator.comparingInt(nhan_vien::getYear).thenComparingInt(nhan_vien::getMonth).thenComparingInt(nhan_vien::getDay));
        for(nhan_vien x: ls) System.out.println(x);
        
    }
}

