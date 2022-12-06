
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
class Pair<T,U>{
    private T fi;
    private U se;

    public Pair(T fi, U se){
        this.fi = fi;
        this.se = se;
    }
    public T getFirst(){
        return fi;
    }
    public U getSecond(){
        return se;
    }
     public <T ,U> boolean isPrime(){
        for(int i = 2; i <= Math.sqrt((Integer)fi); i++){
            if((Integer)fi % i == 0) return false; 
        }
        for(int i = 2; i <= Math.sqrt((Integer)se); i++){
            if((Integer)se % i == 0) return false; 
        }
        return true;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf((Integer)fi) + " " + String.valueOf((Integer)se);
    }

}
public class LopPairFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
