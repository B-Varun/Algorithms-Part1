package com.java.algo.union.find;

import java.util.Set;
import java.util.HashSet;
public class Node{
public int name;
public Set<Integer> connectedSet;

public Node(int num){
name = num;
connectedSet = new HashSet();
}
public String toString(){
return String.valueOf(name);
}
}