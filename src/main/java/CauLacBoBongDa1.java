/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class Clb{
    private String ma,ten;
    private long gve;
    public Clb(String ma, String ten, long gve){
        this.ma = ma;
        this.ten = ten;
        this.gve = gve;
    }
    public long getGve(){
        return gve;
    }
    public String getTen(){
        return ten;
    }
    public String getMa(){
        return ma;
    }
}
class TranDau{
    private Clb clb;
    private String ma;
    private long cdv;
    public TranDau(Clb clb,String ma, long cdv){
        this.clb = clb;
        this.ma = ma;
        this.cdv = cdv;
    }
    public String getMa(){
        return ma;
    }
    public long getDoanhThu(){
        return clb.getGve()*cdv;
    }
    @Override
    public String toString(){
        return ma+" "+clb.getTen()+" "+getDoanhThu();
    }
}
public class CauLacBoBongDa1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Clb> lsclb = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long gve = Long.parseLong(sc.nextLine());
            lsclb.add(new Clb(ma,ten,gve));
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau> lstd = new ArrayList<>();
        while(n-- > 0){
            String info = sc.nextLine();
            String[] tokens = info.split("\\s+");
            for(Clb x:lsclb){
                if(tokens[0].substring(1,3).equals(x.getMa())){
                    lstd.add(new TranDau(x,tokens[0],Long.parseLong(tokens[1])));
                }
            }
        }
        Collections.sort(lstd,Comparator.comparingLong(TranDau::getDoanhThu).reversed().thenComparing(TranDau::getMa));
        for(TranDau x: lstd) System.out.println(x);
    }
}
