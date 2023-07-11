package com.practise.weight.union.one;

public class WeightedUnion_1{
private int size;
private int[] arr, height;

public WeightedUnion_1(int n){
size = n;
height = new int[size];
arr = new int[size];
for(int i=0; i<size; i++){
 height[i] = 1;
 arr[i] = i;
}
}

public void printHeight(){
for(int i=0; i<size;i++)
 System.out.print(height[i]+"\t");
}

public void union(int a, int b){
 int aR = root(a), bR = root(b);
 if(height[aR] >= height[bR]){
 if(height[aR] == height[bR])
	height[aR]++;
    arr[bR] = aR;
 }
 else
    arr[aR] = bR;
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