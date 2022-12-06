/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */

import java.util.*;
class hs{
    private String ten,ma;
    private double diem;
    private int xh;
    public hs(int i,String ten, double diem){
        this.ma = "HS"+String.format("%02d", i);
        this.ten = ten;
        this.diem = diem;
    }
    public String getXL(){
        if(diem >= 9) return "Gioi";
        else if(diem >= 7) return "Kha";
        else if(diem >= 5) return "Trung Binh";
        else return "Yeu";
    }
    public String getMa(){
        return ma;
    }
    public void setXH(int i){
        this.xh = i;
    }
    public int getXH(){
        return xh;
    }
    public double getDiem(){
        return diem;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f", diem)+" "+getXL()+" "+getXH();
    }
}
public class xep_hang_hs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hs> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new hs(i,sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparingDouble(hs::getDiem).reversed());
        ls.get(0).setXH(1);
        int cnt = 1, check = 0;
        for(int i = 1; i < ls.size(); i++){
            if(ls.get(i).getDiem() == ls.get(i-1).getDiem()) {
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
        Collections.sort(ls,Comparator.comparing(hs::getMa));
        for(hs x:ls) System.out.println(x);
    }
}
