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
class ThiSinh{
     private String name,id;
    private float p1,p2,p3;
    public ThiSinh(String id, String name, float p1, float p2, float p3){
        name = name.trim().toLowerCase();
        String[] token = name.split("\\s+");
        String res="";
        for(String x:token){
            res = res+ x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        }
        this.name = res;
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public String getMa(){
        return id;
    }
    public double getKV(){
        if(id.substring(0,3).compareTo("KV1") == 0) return 0.5;
        if(id.substring(0,3).compareTo("KV2") == 0) return 1;
        return 2.5;
    }
    public double getSum(){
        return p1*2.0+p2+p3+getKV();
    }
//    public String getTT(){
//        if(getSum()+getKV() >= 24) return "TRUNG TUYEN";
//        return "TRUOT";
//    }
    @Override
    
    public String toString(){
        if(getKV() != 1){
            if(getSum() - (int)getSum() != 0) return id+" "+name+String.format("%.1f",getKV())+" "+String.format("%.1f ",getSum())+" ";
            else return id+" "+name+String.format("%.1f",getKV())+" "+(int)getSum()+" ";
        }
        else{
            if(getSum() - (int)getSum() != 0) return id+" "+name+1+" "+String.format("%.1f ",getSum())+" ";
            else return id+" "+name+1+" "+(int)getSum()+" ";
        }
    }
}
public class XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("THISINH.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        int n = Integer.parseInt(sc.nextLine());
        Collections.sort(ls,Comparator.comparingDouble(ThiSinh::getSum).reversed().thenComparing(ThiSinh::getMa));
        double diemchuan = ls.get(n-1).getSum();
        System.out.format("%.1f\n",diemchuan);
        
        for(ThiSinh x: ls) {
            if(x.getSum() >= diemchuan){
                 System.out.print(x);
                 System.out.println("TRUNG TUYEN");
            }
            else {
                System.out.print(x);
                System.out.println("TRUOT");
            }
        }
       
        
    }
}
