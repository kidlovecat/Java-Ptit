/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

/**
 *
 * @author ASUS2020
 */
import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Lua Chon ");
        System.out.println("Thoat");
        System.out.println("1. Nhap n,m");
        System.out.println("2. BCNN - UCNL");
        System.out.println("3. SNT n den m");
        System.out.println("4. Nhap 1 day so nguyen");
        System.out.println("5. Lay Min MAX");
        System.out.println("6. SolanxuatHien");
        System.out.println("7. NhapMaTranVuong");
        System.out.println("8. maTRanChuyenVi");
        System.out.println("9. MAX cot MAX hang");
        xuly2songuyen NM = new xuly2songuyen(0, 0);
        Xulydaysonguyen ab = new Xulydaysonguyen();
        matranvuong arr = new matranvuong(0, 0);
        while (true) {

            int n, m;
            int t = sc.nextInt();

            switch (t) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    
                    NM.Nhap(sc);
                    break;

                case 2:
                    System.out.println(NM.UCLN());
                    System.out.println(NM.BCNN());
                    break;

                case 3:

                    NM.SNT();
                    break;

                case 4:

                    ab.nhap(sc);
                    break;

                case 5:

                    System.out.println(ab.getmin());
                    System.out.println(ab.getmax());
                    break;
                case 6:

                    ab.SoLanXuatHien();
                    break;
                case 7:

                    arr.nhap(sc);
                    break;
                case 8:

                    arr.MaTranChuyenVi();
                    break;
                case 9:

                    System.out.println(arr.amx());
                    break;
                default:
                    System.out.println("Nhap Lai");
            }
        }
    }
}
