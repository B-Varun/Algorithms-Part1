package com.algo.union.find;

import java.util.Set;
import java.util.HashSet;

public class Unit
{
public int name;
public Set<Integer> connectedSet;

public Unit(int n){
 this.name = n;
 connectedSet = new HashSet<>();
}

public String toString(){
 return String.valueOf(name);
}
}