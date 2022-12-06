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
class SanPham{
    private String ma,ten,bh;
    private long mua;
    public SanPham(String ma,String ten,String mua,String bh){
        this.ma = ma;
        this.ten = ten;
        this.mua = Long.parseLong(mua);
        this.bh = bh;
    }
    public long getMua(){
        return mua;
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+mua+" "+bh;
               
    }
}
public class DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("SANPHAM.in");
        Scanner sc = new Scanner(f);
        ArrayList<SanPham> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            ls.add(new SanPham(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparing(SanPham::getMua).reversed().thenComparing(SanPham::getMa));
        for(SanPham x:ls) System.out.println(x);
    }
}
