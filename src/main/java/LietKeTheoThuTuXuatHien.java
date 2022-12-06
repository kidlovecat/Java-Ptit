/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
import java.io.*;
public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> l = (ArrayList<String>) sc.readObject();
        Set<String> s = new TreeSet<>();
        for (String i : l) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            s.addAll(Arrays.asList(words));
        }
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        while (sc2.hasNext()) {
            String x = sc2.next().toLowerCase();
            if (s.contains(x)) {
                System.out.println(x);
                s.remove(x);
            }
        }
    }
}
