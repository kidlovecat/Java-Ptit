/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class NhanVien{
    private String cv,hsl,sh,ten;
    public NhanVien(String ma,String ten){
        this.cv = ma.substring(0,2);
        this.hsl = ma.substring(2,4);
        this.sh = ma.substring(4);
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public String getCV(){
        return cv;
    }
    public String getBac(){
        return hsl;
    }
    public String getSH(){
        return sh;
    }
    @Override
    public String toString(){
        return ten+" "+cv+" "+sh+" "+hsl;
    }
}
public class LietKeNhanVienTheoNhom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
      
        while(t-- > 0){
            String s = sc.nextLine();
            String token0 = s.substring(0,7),token1 = s.substring(8);
            if(token0.substring(0,2).equals("GD") && Integer.parseInt(token0.substring(4)) == 1){
                ls.add(new NhanVien(token0,token1));
//                cntGD++;
            }
            else if(token0.substring(0,2).equals("TP") && Integer.parseInt(token0.substring(4)) <= 3){
                ls.add(new NhanVien(token0,token1));
//                cntTP++;
            }
            else if(token0.substring(0,2).equals("PP") && Integer.parseInt(token0.substring(4)) <= 3){
                ls.add(new NhanVien(token0,token1));
//                cntPP++;
            }
            else{
                String ma  = "NV"+token0.substring(2);
                ls.add(new NhanVien(ma,token1));
            }
        }
        Collections.sort(ls,Comparator.comparing(NhanVien::getBac).reversed().thenComparing(NhanVien::getSH));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            for(NhanVien x:ls){
                if(x.getTen().toLowerCase().contains(s.toLowerCase())) System.out.println(x);
            }
            System.out.println();
        }
    }
}
