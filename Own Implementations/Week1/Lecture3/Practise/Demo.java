package com.java.algo.weight.union.demo;
import com.practise.weight.union.one.WeightedUnion_1;
public class Demo{
public static void main(String... union){
WeightedUnion_1 ds = new WeightedUnion_1(10);
System.out.println("Is 0 & 8 connected : "+ds.connected(0,8));
ds.union(0,1);
ds.union(1,2);
ds.union(3,4);
ds.union(4,5);
ds.union(7,8);
ds.union(5,7);
ds.union(2,8);
System.out.println("Is 0 & 8 connected : "+ds.connected(0,8));

System.out.println("Height of the tree : ");
ds.printHeight();
}
}