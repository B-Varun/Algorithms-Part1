package com.java.algo.weight.union;
public class WeightedUnion{
private int size;
private int[] connectedSet, weight;

public WeightedUnion(int s) {
	size = s;
	connectedSet = new int[size];
	weight = new int[size];
	
	for(int i=0; i<size; i++) {
		connectedSet[i] = i;
		weight[i] = 1;
	}
}

public void union(int a, int b) {
	int parentA = root(a);
	int parentB = root(b);
	
	if(parentA == parentB)
		return;
	else if(weight[parentA] > weight[parentB]) {
		connectedSet[parentB] = parentA;
	}
	else {
		weight[parentB]++;
		connectedSet[parentA] = parentB;
	}
}

public boolean connected(int a, int b) {
	return (root(a) == root(b)) ? true : false;
}

public int root(int val) {
	while(val!=connectedSet[val])
		val = connectedSet[val];
	return val;
}
}