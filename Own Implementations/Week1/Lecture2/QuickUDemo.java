package com.java.algo.quick.union.demo;
import com.java.algo.quick.union.impl.QuickUnion;
public class QuickUDemo{
public static void main(String... union){
QuickUnion ds = new QuickUnion(4);
System.out.println("Is 0 & 1 connected : "+ds.find(0,1));
ds.union(0,1);
System.out.println("Is 0 & 1 connected : "+ds.find(0,1));

System.out.println("Is 1 & 2 connected : "+ds.find(1,2));
ds.union(1,2);
System.out.println("Is 1 & 2 connected : "+ds.find(1,2));


System.out.println("Is 2 & 3 connected : "+ds.find(2,3));
ds.union(2,3);
System.out.println("Is 2 & 3 connected : "+ds.find(2,3));

}
}