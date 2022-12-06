
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
class Ten{
    private String ten,ho,td,vt;
    private String[] tendem;
    private int sotu;
    public Ten(String h,String tendem, String t){
        this.ten = t;
        this.ho = h;
        this.td = tendem;
                
        String[] tokens = tendem.split(" ");
        this.sotu = tokens.length+2;
        String res = "";
        for(String x:tokens){
            res = res +"."+String.valueOf(x.charAt(0)).toUpperCase();
        }
        this.vt = String.valueOf(ho.charAt(0)).toUpperCase()+res+"."+String.valueOf(ten.charAt(0)).toUpperCase();
    }
    public int getSoTu(){
        return sotu;
    }
    public String getVt(){
        return vt;
    } 
    public String getTen(){
        return ten;
    }
    public String getHo(){
        return ho;
    }
    public String[] getTenDem(){
        return tendem;
    }
    @Override
    public String toString(){
  
 
        return ho+" "+td+ten;
    }
}
public class TenVietTat {
        public static void main(String[] args) throws FileNotFoundException, IOException{ 
            File f = new File("DANHSACH.in");
            Scanner sc = new Scanner(f);
            ArrayList<Ten> ls = new ArrayList<>();
            int t =0,test = Integer.parseInt(sc.nextLine());
            while(test-->0){
                
                String ten = sc.nextLine();
                ten = ten.trim();        
                String[] tokens = ten.split(" ");
                ten = tokens[tokens.length-1];
                String ho  = tokens[0];
                String td="";
                for(int i = 1; i < tokens.length-1; i++){
                    td = td + tokens[i]+" ";
                }
                String tendem = td;
//                System.out.print(res.trim());
                ls.add(new Ten(ho,tendem,ten));
            }
            Collections.sort(ls,Comparator.comparing(Ten::getTen).thenComparing(Ten::getHo));
            t = Integer.parseInt(sc.nextLine());
            while(t-- > 0){
                String s =sc.nextLine();
                int i = s.indexOf('*');
                String[] tmp = s.replace('.',' ').split(" ");
                if(i == 0){
                    String res="";
                    res = s.substring(1);
                    for(Ten x : ls){
                        if(x.getSoTu() != tmp.length) continue;
                        if(x.getVt().contains(res) && x.getVt().length()-res.length()==1){
                            System.out.println(x);
                        }
                    }
                }else if(i == s.length()-1){
                    String res = "";
                    res = s.substring(0,s.length()-1);
                    for(Ten x : ls){
                        if(x.getSoTu() != tmp.length) continue;
                        if(x.getVt().contains(res) && x.getVt().length()-res.length()==1){
                            System.out.println(x);
                        }
                    }
                }
                else{
                    String res1 = "";
                    String res2 = "";
                    res1 = s.substring(0,i);
                    res2 = s.substring(i+1);
                    for(Ten x : ls){
                        if(x.getSoTu() != tmp.length) continue;
                        if(x.getVt().contains(res1) && x.getVt().contains(res2) && x.getVt().indexOf(res1)+res1.length()==i && x.getVt().indexOf(res2)==i+1 && (x.getVt().indexOf(res1) < x.getVt().indexOf(res2) || res1.equals(res2) )){
                            System.out.println(x);
                        }
                    }
                }

                
            }
 
//            for(Ten x: ls) System.out.println(x);
        }
}
