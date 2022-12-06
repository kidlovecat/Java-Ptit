/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class SVsub{
    private String name;
    private long AC,sub;

    public SVsub(String name, long AC, long sub) {
        this.name = name;
        this.AC = AC;
        this.sub = sub;
    }

    public long getAC() {
        return AC;
    }

    public String getName() {
        return name;
    }

    public long getSub() {
        return sub;
    }

    @Override
    public String toString() {
        return name+" "+AC+" "+sub;
    }
}
public class bang_xh {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SVsub> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s1=sc.nextLine();
            String[] s2=sc.nextLine().split(" ");
            list.add(new SVsub(s1, Long.parseLong(s2[0]), Long.parseLong(s2[1])));
        }
        Collections.sort(list, Comparator.comparingLong(SVsub::getAC).reversed().thenComparingLong(SVsub::getSub).thenComparing(SVsub::getName));
        for(SVsub x:list){
            System.out.println(x);
        }        
    }
}
