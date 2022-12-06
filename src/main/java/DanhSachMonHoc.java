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
class MonHoc{
    private String ma,ten,sotin;
    public MonHoc(String ma,String ten,String sotin){
        this.ma = ma;
        this.ten = ten;
        this.sotin = sotin;
    }
    public String getTen(){
        return ten;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sotin;
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ls = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sotin = sc.nextLine();
            ls.add(new MonHoc(ma,ten,sotin));
        }
        Collections.sort(ls,Comparator.comparing(MonHoc::getTen));
        for(MonHoc x: ls){
            System.out.println(x);
        }
    }
}
