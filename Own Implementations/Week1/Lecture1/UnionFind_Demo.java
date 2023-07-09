package com.algo.union.find.demo;
import com.algo.union.find.impl.UnionFind;

public class UnionFind_Demo{
public static void main(String... disjoint){
 UnionFind disjoint_Set = new UnionFind(4);
 System.out.println("Are 0 & 1 connected : "+disjoint_Set.find(0,1));
 System.out.println("Are 1 & 2 connected : "+disjoint_Set.find(1,2));
 System.out.println("Are 2 & 3 connected : "+disjoint_Set.find(2,3));
 
 disjoint_Set.union(0,1);
 disjoint_Set.union(1,2);
 disjoint_Set.union(2,3);

 System.out.println("Are 0 & 1 connected : "+disjoint_Set.find(0,1));
 System.out.println("Are 1 & 2 connected : "+disjoint_Set.find(1,2));
 System.out.println("Are 2 & 3 connected : "+disjoint_Set.find(2,3));
}
}