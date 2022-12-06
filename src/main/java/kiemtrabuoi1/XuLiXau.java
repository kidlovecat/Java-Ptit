/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrabuoi1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class XuLiXau {
    private String s;
    public XuLiXau(){
        this.s="";
    }
    public void Nhap(Scanner sc){
        this.s = sc.nextLine();
    }
    public int getDoDai(){
        return s.length();
    }
    public void Tach(){
        String[] tokens = s.split("\\s+");
        for(String x: tokens){
            System.out.println(x);
        }
    }
}
