package com.java.algo.quick.union;

public class QuickUnion{
private int size;
private int[] connectedSet;

public QuickUnion(int s) {
	this.size = s;
	connectedSet = new int[size];
	for(int i=0; i<size; i++)
		connectedSet[i] = i;
}

public int root(int val) {
	int i=val;
	while(i!=connectedSet[i])
		i = connectedSet[i];
	return i;
}

public void union(int a, int b) {
	int parentA = root(a);
	int parentB = root(b);

	for(int i=0; i<size; i++)
		if(connectedSet[i] == parentA)
			connectedSet[i] = parentB;
}

public boolean connected(int a, int b) {
	int parentA = root(a);
	int parentB = root(b);
	
	return (parentA == parentB) ? true : false;
}
}