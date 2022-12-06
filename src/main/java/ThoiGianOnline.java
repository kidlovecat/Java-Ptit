
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
class Sv{
    private String ten;
    private Date dst,dfi;
    private SimpleDateFormat datesdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//    private SimpleDateFormat hoursdf = new SimpleDateFormat("hh/mm/ss");
    public Sv(String ten, String s1, String s2) throws ParseException{
        this.ten = ten;
        this.dst = datesdf.parse(s1);
        this.dfi = datesdf.parse(s2);
    }
    public long getP(){
        long diff = dfi.getTime()-dst.getTime();
        return (long)(diff/(60000));
    }
    public String getTen(){
        return ten;
    }
    @Override
    public String toString(){
        return ten+" "+getP();
    }
}
public class ThoiGianOnline {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File f = new File("ONLINE.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sv> ls = new ArrayList<>();
        while(t-- > 0){
            ls.add(new Sv(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls,Comparator.comparingLong(Sv::getP).reversed().thenComparing(Sv::getTen));
        for(Sv x:ls){
            System.out.println(x);
        }
    }
}
