package com.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    Map<Integer, List<Integer>> map = new HashMap<>();
    //Add Vertex
    public boolean addVertex(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            map.put(val, new ArrayList<>());
            return true;
        }
    }
    //Add Edge between Source and Destination
    public boolean addEdge(int s, int d, boolean isBidirectional)
    {
        if (!map.containsKey(s)) {
            addVertex(s);
        }
        if (!map.containsKey(d)) {
            addVertex(d);
        }
        map.get(s).add(d);
        if (isBidirectional) {
            map.get(d).add(s);
        }
        return true;
    }
    //Check if Vertex is present or not
    public boolean checkVertex(int v)
    {
        return map.containsKey(v);

    }
    //Check if Edge is present or not between source and destination
    public boolean checkEdge(int s ,int d)
    {
        return map.get(s).contains(d);
    }
    //Count number of vertex
    public int vertexCount()
    {
        return map.keySet().size();
    }
    //Count number of Edge
    public int edgeCount()
    {
        int count=0;
        for(int v:map.keySet())
        {
            count+=map.get(v).size();
        }
        return count;
    }
    //Delete Edge between Source and Destination
    public boolean deleteEdge(int s,int  d)
    {
        if(!map.containsKey(s) && !map.get(s).contains(d))
        {
            return false;
        }
        map.get(s).remove(d);
        return true;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1,2,false);
        graph.addEdge(1,3,false);
        graph.addEdge(1,4,false);
        graph.addEdge(2,3,false);
        graph.addEdge(3,2,false);
        System.out.println(graph.vertexCount());
        System.out.println(graph.edgeCount());
        System.out.println(graph.checkEdge(1,3));


    }
}
