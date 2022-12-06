/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Lua Chon: ");
        System.out.println("0. Thoat");
        System.out.println("1. Nhap hoa don");
        System.out.println("2. Viet ra");
        System.out.println("3. Tim kiem theo ho ten");
        System.out.println("4. Sap xep theo tien tang");

        ArrayList<HoaDon> ls = new ArrayList<>();
        while (true) {
            System.out.print("Nhap Lua Chon: ");
            
            int t = Integer.parseInt(sc.nextLine());

            switch (t) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Nhap hoa don:  ");
                    System.out.print("Nhap ma: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap ngay (dd/mm/yyyy): ");
                    String ngay = sc.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap tien: ");
                    double tien = Double.parseDouble(sc.nextLine());
                    ls.add(new HoaDon(ma,ngay,ten,tien));
                    break;
                case 2:
                    System.out.println("In ra: ");
                    for(HoaDon x: ls){
                        System.out.println(x);
                    }
                    break;
                case 3:
                    System.out.print("Nhap ten muon tim kiem: "); 
                    String tmp = sc.nextLine();
                    for(HoaDon x: ls){
                        if(x.getHoten().contains(tmp)){
                            System.out.println(x);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sap xep theo tien tang");
                    Collections.sort(ls,Comparator.comparingDouble(HoaDon::getTien));
                    for(HoaDon x: ls){
                        System.out.println(x);
                    }
                    break;
                default:
                    System.out.println("Nhap Lai");
                    
            }
        }
    }
}
