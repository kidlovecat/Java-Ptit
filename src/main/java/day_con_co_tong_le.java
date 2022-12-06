///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author ASUS2020
// */
//import java.util.*;
//public class day_con_co_tong_le {
//    static int n;
//    static int[] a = new int[100];
//    static int[] c = new int[100];
//    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
//    static void Solve(){
//        int s = 0;
//        for(int i = 1; i <= n; i++){
//            s = s+a[i]*c[i];
//        }
//        if(s%2 == 1){
//            ArrayList<Integer> v = new ArrayList<>();
//            for(int i = 1; i <= n; i++){
//                if(c[i] == 1) v.add(a[i]);
//            }
//            v.sort((o1, o2) -> o2 - o1);
//            res.add(v);
//        }
//    }
//    static void Try(int i){
//        for(int j = 0; j <= 1; j++){
//            c[i] = j;
//            if(i == n) Solve();
//            else Try(i+1);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t > 0){
//            int n = sc.nextInt();
//            for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
//            res.clear();
//            for(int i = 0; i < 101; i++) c[i] =0;
//            Try(1);
////            res.sort((o1,o2) -> o1 - o2);
//            Collections.sort(res, new Comparator<ArrayList<Integer>>()){
//                @Override
//                public int compare(ArrayList<>() o1, ArrayList<>() o2) {
//                    return o2.compareTo(o1);
//                }
//            }
//            t--;
//        }
//    }
//}
