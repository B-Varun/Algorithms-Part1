package com.java.algo.weight.union.demo;
import com.java.algo.weight.union.WeightedUnion;
public class WeightedUnion_Demo{
public static void main(String[] args){
WeightedUnion disjointSet = new WeightedUnion(6);
System.out.println("Are 1 and 5 connected : "+disjointSet.connected(1, 5));
System.out.println("Are 2 and 4 connected : "+disjointSet.connected(2,4));
System.out.println("Are 0 and 5 connected : "+disjointSet.connected(0, 5));
System.out.println("Are 2 and 3 connected : "+disjointSet.connected(2, 3));

disjointSet.union(1,5);
disjointSet.union(2,4);
disjointSet.union(0,5);
disjointSet.union(2,3);

System.out.println("Are 1 and 5 connected : "+disjointSet.connected(1, 5));
System.out.println("Are 2 and 4 connected : "+disjointSet.connected(2,4));
System.out.println("Are 0 and 5 connected : "+disjointSet.connected(0, 5));
System.out.println("Are 2 and 3 connected : "+disjointSet.connected(2, 3));
}
}