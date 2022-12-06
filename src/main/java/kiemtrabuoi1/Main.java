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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Lua Chon: ");
        System.out.println("0. Thoat");
        System.out.println("1. Nhap day so thuc");
        System.out.println("2. Tong day so thuc");
        System.out.println("3. Sap xep day so thuc");
        System.out.println("4. Nhap 1 doan");
        System.out.println("5. Dua ra do dai xau");
        System.out.println("6. Tach cac tu trong doan");
        System.out.println("7. Nhap 2 Ma Tran Vuong");
        System.out.println("8. Tinh tong 2 ma tran vuong");
        System.out.println("9. MAX cot MAX hang");
        XuLiDaySoThuc xl = new XuLiDaySoThuc();
        XuLiXau xlx = new XuLiXau();
        MaTranVuong mt1 = new MaTranVuong();
        MaTranVuong mt2 = new MaTranVuong();
        while (true) {
            System.out.print("Nhap Lua Chon: ");
            System.out.println();
//            int n, m;
            int t = sc.nextInt();

            switch (t) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap so luong so: ");
                    int x = sc.nextInt();
                    xl.Nhap(sc,x);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Tong day so thuc: "+ xl.getTong());
                    break;

                case 3:
                    System.out.println("Day so sau khi sap xep: ");
                    xl.SapXep();
                    break;

                case 4:
                    System.out.println("Nhap 1 doan: ");
                    xlx.Nhap(sc);
                    break;

                case 5:

                    System.out.println("Do dai cua xau la :"+ xlx.getDoDai());
                    break;
                case 6:
                    System.out.println("Tach cac tu: ");
                    xlx.Tach();
                    break;
                case 7:
                    System.out.print("Nhap cap ma tran vuong: ");
                    int n = sc.nextInt();
                    System.out.println("Nhap ma tran thu nhat: ");
                    mt1.Nhap(sc,n);
                    System.out.println("Nhap ma tran thu hai: ");
                    mt2.Nhap(sc,n);
                    break;
                case 8:
                    System.out.println("Tong 2 ma tran: ");
                    int[][] tmp = mt1.Cong(mt2);
                    for(int i = 0; i < mt1.getLength(); i++){
                        for(int j = 0; j< mt1.getLength(); j++){
                            System.out.print(tmp[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
//                case 9:
//
//                    System.out.println(arr.amx());
//                    break;
                default:
                    System.out.println("Nhap Lai");
            }
        }
    }
}
