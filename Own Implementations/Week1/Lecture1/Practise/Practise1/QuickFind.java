package com.java.algo.quick.find;
public class QuickFind{
int size;
int[] arr;

public QuickFind(int s){
this.size = s;
arr = new int[size];
for(int i=0; i<size; i++)
 arr[i] = i;
}

public void union(int a, int b){
 int valA = arr[a];
 int valB = arr[b];
 
 if(arr[a] == valB)
  return;
 for(int i=0; i<size; i++)
    if(arr[i] == valA)
      arr[i] = valB;
}

public boolean find(int a, int b){
 return (arr[a] == arr[b]) ? true : false;
}

}