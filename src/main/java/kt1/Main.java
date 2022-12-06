/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

/**
 *
 * @author ASUS2020
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        xulisonguyen sn = new xulisonguyen();
        xulixau x = new xulixau();
        dathuc dt = new dathuc();
        while (true) {
            System.out.println("----------Menu---------");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap vao so n");
            System.out.println("2. Viet ra so chan chia het cho 3");
            System.out.println("3. Viet ra cac hoan vi cua n");
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. Dua ra so tu");
            System.out.println("6. Chuan hoa xau ho ten");
            System.out.println("7. Nhap vao mot da thuc");
            System.out.println("8. Tinh gia tri da thuc tai x = 1");
            System.out.println("9. Viet dao ham bac 1");
            System.out.print("Nhap Lua Chon: ");
            int t = Integer.parseInt(sc.nextLine());

            switch (t) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Nhap so nguyen duong n: ");
                    int tmp = Integer.parseInt(sc.nextLine());
                    sn.Nhap(tmp);
                    break;
                case 2:
                    System.out.println("Cac so chan chia het cho 3: ");
                    sn.In1();
                    break;
                case 3:
                    System.out.println("Viet ra cac hoan vi cua n: ");
                    sn.In2();
                    break;
                case 4:
                    System.out.print("Nhap 1 xau: ");
                    String st = sc.nextLine();
                    x.Nhap(st);
                    break;
                case 5:
                    System.out.print("So tu: "+x.SoTu());
       
                    break;
                case 6:
                    System.out.println("Chuan hoa xau: ");
                    x.ChuanHoa();
                    break;
                case 7:
                    System.out.println("Nhap vao 1 da thuc: ");
                    String tem = sc.nextLine();
                    dt.Nhap(tem);
                    break;
                case 8:
                    System.out.println("Gia tri da thuc tai x = 1: ");
                    
                default:
                    System.out.println("Nhap Lai");
                    
            }
        }
        
    }
}
