/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class HocSinh{
    private String ma,name;
    private String[] diem;

    public HocSinh(int ma,String name, String diem) {
        this.ma="HS"+String.format("%02d", ma);
        this.name = name;
        this.diem = diem.split("\\s+");
    }
    
    public double getDiem() {
        double sum=0;
        for(String x:diem){
            sum+=Double.parseDouble(x);
        }
        sum+=Double.parseDouble(diem[0])+Double.parseDouble(diem[1]);
        return sum/12;
    }

    public String getXepLoai() {
        if(getDiem()>=9)
            return "XUAT SAC";
        else if(getDiem()>=8)
            return "GIOI";
        else if(getDiem()>=7)
            return "KHA";
        else if(getDiem()>=5)
            return "TB";
        else 
            return "YEU";
    }
    public String getXH(){
        if(getDiem() >= 9) return "XUAT SAC";
        else if(getDiem() >= 8) return "GIOI";
        else if(getDiem() >= 7) return "KHA";
        else if(getDiem() >= 5) return "TB";
        else return "YEU";
    }
    
    @Override
    public String toString() {
        return ma + " " + name + " " + String.format("%.1f", (double)Math.round(getDiem() * 100) / 100) + " " + getXH();
    }
    
    
}
public class bang_diem_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new HocSinh(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparingDouble(HocSinh::getDiem).reversed());
        for(HocSinh x:list){
            System.out.println(x);
        }
    }
}
