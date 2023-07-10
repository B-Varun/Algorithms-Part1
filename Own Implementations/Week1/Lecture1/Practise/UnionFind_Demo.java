package com.java.algo.union.find.demo;
import com.java.algo.union.find.impl.UnionFind;

public class UnionFind_Demo{
public static void main(String... args){
UnionFind ds = new UnionFind(3);
ds.union(0,1);
System.out.println("Is 0 & 1 connected : "+ds.find(0,1));
System.out.println("Is 0 & 1 connected : "+ds.find(1,2));
ds.union(0,2);
System.out.println("Is 0 & 1 connected : "+ds.find(1,2));
System.out.println("Is 0 & 1 connected : "+ds.find(0,2));
}
}