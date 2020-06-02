package com.heap;

import java.util.Arrays;

public class BinaryMinHeap {

    private int capacity=5;
   private int size;
   private int heap[];
   BinaryMinHeap()
   {
       heap= new int[capacity];
   }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int peek() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Heap is empty");
        }
        return heap[0];
    }
    public boolean add(int val)
    {
        isHeapFull();
        heap[size]=val;
        size++;
        heapifyUp();
        return true;

    }

    private void heapifyUp() {

    }

    public boolean remove()
    {
        int temp=heap[size-1];
        heap[0]=temp;
        size--;
        heapifyDown();
        
return true;
    }

    private void heapifyDown() {
    }

    private void isHeapFull() {
       if(size==capacity) {
           Arrays.copyOf(heap, capacity * 2);
           capacity=capacity*2;
       }

    }
    private void swap(int firstIndex,int secondIndex)
    {
        int temp=heap[firstIndex];
        heap[firstIndex]=heap[secondIndex];
        heap[secondIndex]=temp;
    }
    private int getLeftChildIndex(int parent)
    {
        return parent*2+1;
    }
    private int getRightChildIndex(int parent)
    {
        return parent*2+2;
    }
    private int getParentIndex(int child)
    {
        return (child-1)/2;
    }
    private boolean hasParentIndex(int index)
    {
        return index!=0 && getParentIndex(index) >= size;
    }
    private boolean hasLeftChildIndex(int index)
    {
        return getLeftChildIndex(index)<size;
    }
    private boolean hasRightChildIndex(int index)
    {
        return getRightChildIndex(index)<size;
    }
    private int LeftChild(int index)
    {
        return heap[getLeftChildIndex(index)];
    }
    private int RightChild(int index)
    {
        return heap[getRightChildIndex(index)];
    }
    private int ParentChild(int index)
    {
        return heap[getParentIndex(index)];
    }
}
