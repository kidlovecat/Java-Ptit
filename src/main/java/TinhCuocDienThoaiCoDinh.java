/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

class DienThoai {

    private String vung, ten;
    private long Cuoc;

    public DienThoai(String vung, String ten, long Cuoc) {
        this.vung = vung;
        this.ten = ten;
        this.Cuoc = Cuoc;
    }

    public long getCuoc() {
        return Cuoc;
    }

    public String getTen() {
        return ten;
    }

    public String getVung() {
        return vung;
    }

}

class CuocGoi {

    private DienThoai dt;
    private String so;
    private String begin, end;
    private int gvao,pvao,gra,pra;
//    private SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

    public CuocGoi(DienThoai dt, String so, String begin, String end) throws ParseException {
        this.gvao = Integer.parseInt(begin.substring(0,2)); this.pvao = Integer.parseInt(begin.substring(3));
        this.gra = Integer.parseInt(end.substring(0,2)); this.pra = Integer.parseInt(end.substring(3));
        this.dt = dt;
        this.so = so;
        this.begin = begin;
        this.end = end;
    }
    public int gGoi(){
        if(pvao > pra) return gra-1-gvao;
        return gra-gvao;
    }
    public int pGoi(){
        if(pvao > pra) return (60 - Math.abs(pvao - pra))+gGoi()*60;
        return Math.abs(pvao - pra)+gGoi()*60;
    }
    public CuocGoi(String so, String begin, String end) throws ParseException {
        this.so = so;
        this.begin = begin;
        this.end = end;
        this.gvao = Integer.parseInt(begin.substring(0,2)); this.pvao = Integer.parseInt(begin.substring(3));
        this.gra = Integer.parseInt(end.substring(0,2)); this.pra = Integer.parseInt(end.substring(3));
    }
    

    public String Vung() {
        if (so.charAt(0) != '0') {
            return "Noi mang";
        } 
        else {
            return dt.getTen();
        }
    }

    public int Phut() {
//        long Giay = (end.getTime() - begin.getTime()) / 1000;
//        long phut = Giay / 60;
        if (Vung().equals("Noi mang")) {
            double DPhut=(double)pGoi()/3.0;
            return (int)Math.ceil(DPhut);
        } 
        else {
            return pGoi();
        }
    }

    public long Gia() {
        if (Vung().equals("Noi mang")) {
            return 800;
        } 
        else {
            return dt.getCuoc();
        }
    }

    public long Tien() {
        return (long)Phut() * Gia();
    }

    @Override
    public String toString() {
        return so + " " + Vung() + " " + Phut() + " " + Tien();
    }

}
public class TinhCuocDienThoaiCoDinh {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai> list1 = new ArrayList<>();
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n1; i++) {
            list1.add(new DienThoai(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        int n2 = Integer.parseInt(sc.nextLine());
        ArrayList<CuocGoi> list2 = new ArrayList<>();
        for (int i = 1; i <= n2; i++) {
            String[] s = sc.nextLine().split("\\s+");
            if (s[0].charAt(0) != '0') {
                list2.add(new CuocGoi(s[0], s[1], s[2]));
            } 
            else {
                String so = s[0].substring(1, 3);
                for (DienThoai x : list1) {
                    if (x.getVung().equals(so)) {
                        list2.add(new CuocGoi(x, s[0], s[1], s[2]));
                        break;
                    }
                }
            }
        }
        Collections.sort(list2,Comparator.comparingLong(CuocGoi::Tien).reversed());
        for (CuocGoi x : list2) {
            System.out.println(x);
        }
    }
}
