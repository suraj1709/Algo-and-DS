package com.graph;

import java.util.*;

public class DijkstraShortestPath {

    Map<Integer, List<List<Integer>>> map = new HashMap<>();
    public  void addEdge(int S,int D,int distance)
    {
        List<Integer> StoDList= new ArrayList<>();
        List<Integer> DtoSList= new ArrayList<>();
        StoDList.add(D);
        StoDList.add(distance);
        DtoSList.add(S);
        DtoSList.add(distance);
        if(!map.containsKey(S))
        {
            map.put(S,new ArrayList<>());
        }
        map.get(S).add(StoDList);
        if(!map.containsKey(S))
        {
            map.put(D,new ArrayList<>());
        }
        map.get(D).add(DtoSList);
    }

    public void Dijkstra(int s)
    {
        if(!map.containsKey(s))
        {

        }
         for(int vertex:map.keySet())
         {

         }

    }
}