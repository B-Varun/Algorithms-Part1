package com.java.algo.quick.union.impl;

public class QuickUnion{
int size=-1;
int[] arr;

public QuickUnion(int n){
size = n;
arr = new int[size];

for(int i=0;i<size;i++)
 arr[i] = i;
}

public boolean find(int a, int b){
 return root(a) == root(b);
}

public void union(int a, int b){
int rA = root(a);
int rB = root(b);
arr[a] = rB;
}

public int root(int a){
while(arr[a] != a)
 a = arr[a];
return arr[a];
}

}