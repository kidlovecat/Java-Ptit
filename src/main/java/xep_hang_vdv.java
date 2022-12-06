/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */

import java.util.*;

class vdv{
    private String ma,ten,ns;
    private String st,en;
    private int xh;
    public vdv(int ma, String ten, String ns, String st,String en){
        this.ma = "VDV"+String.format("%02d", ma);
        this.ten = ten;
        this.ns = ns;
        this.st = st;
        this.en = en;
    }
    public void setXH(int i){
        this.xh = i;
    }
    public int getXH(){
        return xh;
    }
    public String getMa(){
        return ma;
    }
    public long getTime(String d){
        return Long.parseLong(d.substring(0,2))*60*60+Long.parseLong(d.substring(3,5))*60+Long.parseLong(d.substring(6));
    }
    public String getPeriod(String d1,String d2){ //tinh khoang thoi gian giua 2 moc
        long Giay=(getTime(d2)-getTime(d1));
        long Gio=(long)(Giay/3600);
        long Phut=(long)((Giay-Gio*3600)/60);
        Giay=Giay-Gio*3600-Phut*60;
        return String.format("%02d", Gio)+ ":" + String.format("%02d", Phut) + ":"+String.format("%02d", Giay);       
    }
     public String getPrio() { // thoi gian uu tien
        long tuoi=2021-Long.parseLong(ns.substring(6));
        if(tuoi<18) return "00:00:00";
        else if(tuoi<25) return "00:00:01";
        else if(tuoi<32)    return "00:00:02";
        else return "00:00:03";
    }
    public String getRealPeriod()  {       // thoi gian thuc te sau khi uu tien
        return getPeriod(getPrio(),getResult());       
    }
    public long getTimeReal(){
        return getTime(getRealPeriod());
    }
    public String getResult() { //thoi gian thuc te chua uu tien
        return getPeriod(st,en);        
    }
    
    @Override
    public String toString(){
   
        return ma+" "+ten+" "+getResult()+" "+getPrio()+" "+getRealPeriod()+" "+getXH();
        
    }
}
public class xep_hang_vdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<vdv> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            ls.add(new vdv(i,ten,ns,start,end));
        }
        Collections.sort(ls,Comparator.comparingLong(vdv::getTimeReal));
        ls.get(0).setXH(1);
        int cnt = 1, check = 0;
        for(int i = 1; i < ls.size(); i++){
            if(ls.get(i).getRealPeriod().compareTo(ls.get(i-1).getRealPeriod()) == 0) {
                ls.get(i).setXH(ls.get(i-1).getXH());
                cnt++;
                check = 1;
            }
            else {
                if(check == 1){
                    ls.get(i).setXH(ls.get(i-1).getXH()+cnt);
                    
                }else{
                    ls.get(i).setXH(ls.get(i-1).getXH()+1);
                }
                cnt=1;
                check = 0;
            }
        }
        Collections.sort(ls,Comparator.comparing(vdv::getMa));
        for(vdv x: ls) System.out.println(x);
    }
}
