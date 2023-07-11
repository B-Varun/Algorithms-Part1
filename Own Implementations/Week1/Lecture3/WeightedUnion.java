package com.java.algo.weight.union.impl;
public class WeightedUnion{
private int size;
private int[] arr, height;

public void printHeight(){
for(int i=0; i<size; i++)
  System.out.print(height[i]+"\t");
}

public WeightedUnion(int n){
size = n;
arr = new int[size];
height = new int[size];

for(int i=0; i<size; i++){
 arr[i] = i;
 height[i] = 1;
}
}

public void union(int a,int b){
int rA = root(a);
int rB = root(b);
if(height[rA] >= height[rB]){
 if(height[rA] == height[rB])
    height[rA] = height[rA] + 1;
 arr[rB] = rA;
}
else{
 if(height[rA] == height[rB])
    height[rB] = height[rB] + 1;
 arr[rA] = rB;
}
}

public boolean connected(int a, int b){
 return root(a) == root(b);
}

public int root(int a){
 while(a != arr[a])
    a = arr[a];
 return a;
}
}