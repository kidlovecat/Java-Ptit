/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class SinhVien{
    private String ma,ten,lop,diemdanh;
    public SinhVien(String ma,String ten,String lop){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    public void setDiemDanh(String diemdanh){
        this.diemdanh = diemdanh;
    }
    public String getMa(){
        return ma;
    }
    public String getLop(){
        return lop;
    }
    public String getDiemCC(){
        int diem = 10;
        for(int i = 0; i < 10; i++){
            if(diemdanh.charAt(i) == 'm') {
                diem-=1;
            }
            else if(diemdanh.charAt(i) == 'v') {
                diem -=2;
            }
            
        }
        if(diem > 0) return String.valueOf(diem);
        return "0 KDDK";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+getDiemCC();
    }
}
public class DiemDanh1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int n = t;
        ArrayList<SinhVien> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        while(n-- > 0){
            String s = sc.nextLine();
            String[] tokens = s.split("\\s+");
            for(SinhVien y:ls){
                if(y.getMa().equals(tokens[0])){
                    y.setDiemDanh(tokens[1]);
                }
            }
        }
        String lop = sc.nextLine();
        for(SinhVien x: ls) {
            if(x.getLop().equals(lop)) {
                System.out.println(x);
            }
        }
    }
}
