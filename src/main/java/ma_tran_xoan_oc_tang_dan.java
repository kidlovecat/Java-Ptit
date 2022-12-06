/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;

public class ma_tran_xoan_oc_tang_dan {
    static int[][] sapXepTang(int[][] x,int n){
	int k = n*n;
	for(int i=0; i<k-1; i++){
		for(int j=i+1; j<k; j++){
			if(x[i/n][i%n]>x[j/n][j%n]){
				int temp  = x[i/n][i%n];
				x[i/n][i%n] = x[j/n][j%n];
				x[j/n][j%n] = temp;
			}
		}
	}
	return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[n*n];
        for(int i = 0; i < n*n; i++){
             b[i] = sc.nextInt();
        }
        Arrays.sort(b,0,n*n);
        int d=0 ,hang=n-1,cot=n-1;
        int sl = 0;
        while (sl<n*n){
            for (int i = d; i <= cot; i++) 	a[d][i] = b[sl++];
            for (int i = d + 1; i <= hang; i++) a[i][cot] = b[sl++];
            for (int i = cot - 1; i >= d; i--)  a[hang][i] = b[sl++];
            for (int i = hang - 1; i > d; i--)  a[i][d] = b[sl++];
            d++;
            hang--;
            cot--;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
