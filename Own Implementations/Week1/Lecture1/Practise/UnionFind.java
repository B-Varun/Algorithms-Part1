package com.java.algo.union.find.impl;

import com.java.algo.union.find.Node;
import java.util.List;
import java.util.ArrayList;
public class UnionFind{
public List<Node> list;
public int size;

public UnionFind(int size){
this.size = size;
list = new ArrayList(size);
for(int i=0;i<size;i++){
 Node node = new Node(i);
 list.add(node);
 }
}

public void union(int a, int b){
 addEdge(a,b);
 addEdge(b,a);
}

public void addEdge(int p, int q){
 for(int i=0; i<size;i++){
    Node node = list.get(i);    
 if(Integer.valueOf(node.name) == p)
   node.connectedSet.add(q);
}
}

public boolean find(int a, int b){
 for(int i=0; i<size; i++){
  Node node = list.get(i);
  if(Integer.valueOf(node.name) == a)
	if(node.connectedSet.contains(b))
		return true;
 }
 return false;
}

}