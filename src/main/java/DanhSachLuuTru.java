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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
class KhachHang{
    private String ma,ten,phong;
    private Date den,di;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public KhachHang(int ma,String ten,String phong, String den ,String di) throws ParseException{
        this.ma = "KH"+String.format("%02d", ma);
        this.ten = ten;
        this.phong = phong;
        this.den = sdf.parse(den);
        this.di = sdf.parse(di);
    }
    public long getPeriod(){
        long diff = di.getTime()-den.getTime();
        TimeUnit t = TimeUnit.DAYS;
        long res = t.convert(diff,TimeUnit.MILLISECONDS);
        return res;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+phong+" "+getPeriod();
    }
}
public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        File f = new File("KHACH.in");
        Scanner sc = new Scanner(f);
        ArrayList<KhachHang> ls = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            ls.add(new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparingLong(KhachHang::getPeriod).reversed());
        for(KhachHang x: ls)System.out.println(x);
    }
}
