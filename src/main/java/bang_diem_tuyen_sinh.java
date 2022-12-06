/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class ts{
    private String name,id;
    private double p1,p2,p3;
    public ts(String id, String name, double p1, double p2, double p3){
        this.name = name;
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
    public String getTT(){
        if(getSum() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    
    public String toString(){
        if(getKV() != 1){
            if(getSum() - (int)getSum() != 0) return id+" "+name+" "+String.format("%.1f",getKV())+" "+String.format("%.1f",getSum())+" "+getTT();
            else return id+" "+name+" "+String.format("%.1f",getKV())+" "+(int)getSum()+" "+getTT();
        }
        else{
            if(getSum() - (int)getSum() != 0) return id+" "+name+" "+1+" "+String.format("%.1f",getSum())+" "+getTT();
            else return id+" "+name+" "+1+" "+(int)getSum()+" "+getTT();
        }
    }
}
public class bang_diem_tuyen_sinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> ls = new ArrayList<>();
        while(t-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double p1 = Double.parseDouble(sc.nextLine());
            double p2 = Double.parseDouble(sc.nextLine());
            double p3 = Double.parseDouble(sc.nextLine());
            ls.add(new ts(id,name,p1,p2,p3));
        }
        Collections.sort(ls,Comparator.comparingDouble(ts::getSum).reversed().thenComparing(ts::getMa));
        for(ts x: ls) System.out.println(x);
       
        
    }
}
