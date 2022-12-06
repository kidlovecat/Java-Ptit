/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class gv{
    private String ma;
    private String name;
    private String subject;
    public gv(int ma,String name,String subject){
        this.ma="GV"+String.format("%02d",ma);
        this.name=name;
        this.subject=subject;
    }
    public String getSubject() {
        String s=subject.toUpperCase();
        String[] arr=s.split(" ");
        s="";
        for(String x:arr)
            s=s+x.charAt(0);
        return s;
    }

    public String getName() {
//        String[] lengthT=name.split(" ");
//        return lengthT[lengthT.length-1];
        return name;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+name+" "+getSubject();
    }
}
public class sap_xep_ds_giang_vien {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<gv>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            gv lis=new gv(i, sc.nextLine(), sc.nextLine());
            list.add(lis);
        }
       int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String key= sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+ key+":");
            key = key.toLowerCase();
            for(gv x:list){
                if(x.getName().toLowerCase().contains(key)) System.out.println(x);
            }
        }
//        Collections.sort(list, Comparator.comparing(gv::getName).thenComparing(gv::getMa));
//        for(gv x:list)
//            System.out.println(x);
//        int t=Integer.parseInt(sc.nextLine());
//        for(int i=1;i<=t;i++){
//            String key= sc.nextLine().toUpperCase();
//            String[] arr=key.split(" ");
//            key="";
//            for(String x:arr)
//                key+=x.charAt(0);
//            System.out.println("DANH SACH GIANG VIEN BO MON " + key + ":");
//            for (gv x:list)
//                if(x.getSubject().contains(key))
//                    System.out.println(x);
//        }
    }
}
