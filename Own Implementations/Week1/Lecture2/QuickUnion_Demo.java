package com.java.algo.quick.union.demo;

import com.java.algo.quick.union.Quick_Union;

public class QuickUnion_Demo{
public static void main(String... args){
Quick_Union ds = new Quick_Union(4);
System.out.println("Is 0 & 1 connected :"+ds.find(0,1));
ds.union(0,1);
System.out.println("Is 0 & 1 connected :"+ds.find(0,1));
System.out.println("Is 1 & 2 connected :"+ds.find(1,2));
System.out.println("Is 0 & 2 connected :"+ds.find(0,2));
}
}