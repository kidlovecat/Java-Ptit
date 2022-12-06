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
class dn{
    private String ma,ten;
    private int soSv;
    public dn(String ma,String ten,int sosv){
        this.ma = ma;
        this.ten = ten;
        this.soSv = sosv;
    }
    public String getMa(){
        return ma;
    }
    public int getSoSv(){
        return soSv;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+soSv;
               
    }
}
public class danh_sach_doanh_nghiep {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("DN.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dn> ls = new ArrayList<>();
        
        while(t-- > 0){
            ls.add(new dn(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparing(dn::getMa));
        for(dn x:ls) System.out.println(x);
    }
}
