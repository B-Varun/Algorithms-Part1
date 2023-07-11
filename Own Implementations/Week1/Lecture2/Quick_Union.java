package com.java.algo.quick.union;

public class Quick_Union{
private int size;
private int[] elements;

public Quick_Union(int n){
 size = n;
 elements = new int[size];
 for(int i=0; i<size; i++)
    elements[i] = i;
}


public boolean find(int a, int b){
 return (elements[a] == elements[b]);
}

// Replaces val at pos 'a' with 'b' ie., 1st elements is replaced by 2nd element
public void union(int a, int b){
 if(elements[a] == elements[b])
	return;
// int val_B = elements[b];
 int val_B = elements[b];
 int val_A = elements[a];
 for(int i=0; i<size; i++)
    if(elements[i] == val_A)
	elements[i] = val_B;

}

}