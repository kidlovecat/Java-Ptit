/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class nhan_vien {
    private String name;
    private int bSal;
//    private String sex;
//    private String birth;
//    private String address;
    private int nCong;
//    private String number;
    private String pos;
//    private String date;
    public nhan_vien(String name,int bSal,int nCong,String pos){
        this.name = name;
        this.bSal = bSal;
        this.nCong = nCong;
        this.pos = pos;
//        this.sex = sex;
//        this.birth = birth;
//        this.address = address;
//        this.number = number;
//        this.date = date;
    }
    public String getName(){
        return name;
    }
    public int getbSal(){
        return bSal;
    }
    public int getnCong(){
        return nCong;
        
    }
    public String getPos(){
        return pos;
    }
    public int getmonthSal(){
        return bSal*nCong;
    }
    public int getBonus(int month){
        if(nCong >= 25) return 20*month/100;
        else if(nCong >= 22) return 10*month/100;
        return 0;
    }
    public int getAllowence(String pos){
        if(pos.compareTo("GD") == 0) return 250000;
        if(pos.compareTo("PGD") == 0) return 200000;
        if(pos.compareTo("TP") == 0) return 180000;
        return 150000;
    }
//    public String getSex(){
//        return sex;
//    }
//    public String getBirth(){
//        return birth;
//    }
//    public String getaddress(){
//        return address;
//    }
//    public String getNumber(){
//        return number;
//    }
//    public String getdate(){
//        return date;
//    }
//    public void setBirth(){
//        if(birth.charAt(1) == '/') this.birth = "0" + birth;
//        if(birth.charAt(4) == '/') this.birth = birth.substring(0,3) + "0" + birth.substring(3);
//    }
//    public void setDate(){
//        if(date.charAt(1) == '/') this.date = "0" + date;
//        if(date.charAt(4) == '/') this.date = birth.substring(0,3) + "0" + date.substring(3);
//    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int bSal = Integer.parseInt(sc.nextLine());
        int nCong = Integer.parseInt(sc.nextLine());
        String pos = sc.nextLine();

        nhan_vien a = new nhan_vien(name,bSal,nCong,pos);
        System.out.print("NV01"+" ");
        System.out.print(a.getName()+" ");
        System.out.print(a.getmonthSal()+" ");
        System.out.format("%d ",a.getBonus(a.getmonthSal()));
        System.out.print(a.getAllowence(pos)+ " ");
        System.out.format("%d ",a.getmonthSal()+a.getBonus(a.getmonthSal())+a.getAllowence(pos));
        
//        a.setBirth();
//        a.setDate();
//        System.out.print("00001"+" " + a.getName() +" "+ a.getSex() +" " +a.getBirth()+" "+a.getaddress() + " "+ a.getNumber()+" "+a.getdate());
        
    }
}
