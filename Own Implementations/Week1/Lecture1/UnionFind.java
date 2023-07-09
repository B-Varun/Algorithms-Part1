package com.algo.union.find.impl;

import com.algo.union.find.Unit;
import java.util.List;
import java.util.ArrayList;

public class UnionFind
{
private int size;
public List<Unit> list;

public UnionFind(int n)
{
 size = n;
 list = new ArrayList<>(size);
 for(int i=0; i<size; i++)
 {
    Unit unit = new Unit(i);
    list.add(unit);
 }
}

// Connecting 2 objects
public void union(int a, int b)
{
  addEdge(a, b);
  addEdge(b, a);
}

public static int intValue(Unit unit){
 return Integer.valueOf(unit.toString());
}

public void addEdge(int p, int q)
{
 for(int i=0; i<size; i++)
 {
    Unit unit = list.get(i);
    if(intValue(unit) == p)
     {
	unit.connectedSet.add(q);
	return;
     }
 }
}

public boolean find(int a, int b)
{
 for(int i=0; i<size; i++)
  {
    Unit unit = list.get(i);
    if(intValue(unit) == a)
     {
	if(unit.connectedSet.contains(b))
		return true;
     }

  }
 return false;
}
}