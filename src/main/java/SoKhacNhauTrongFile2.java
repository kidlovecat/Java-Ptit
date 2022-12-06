
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) {

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("DATA.IN"))) {
            Map<Integer, Integer> freq = new TreeMap<>();

            try {
                while (true) {
                    Integer num = inputStream.readInt();
                    Integer found = freq.getOrDefault(num,0);
                    freq.put(num, found+1);
                }
            } catch (EOFException e) {
                freq.forEach((key, val) -> System.out.println(key + " " + val));
            }
        } 
        catch (IOException e) {
            
        }
    }
}
