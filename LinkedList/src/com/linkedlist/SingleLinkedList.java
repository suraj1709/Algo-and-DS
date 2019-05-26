package com.linkedlist;





import java.util.ArrayList;
import java.util.List;

import com.node.SingleNode;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;
	int count;
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>(); 
	int povnode=0,negnode=0;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleNode createSingleLinkedList(int value)
	{
		head= new SingleNode();
		SingleNode singlenode = new SingleNode();
		singlenode.setNode(value);
		singlenode.setNext(null);
		head=singlenode;
		tail=singlenode;
		size=1;
		return singlenode;
	}

	public SingleNode getHead() {
		return head;
	}


	public void setHead(SingleNode head) {
		this.head = head;
	}


	public SingleNode getTail() {
		return tail;
	}


	public void setTail(SingleNode tail) {
		this.tail = tail;
	}
public boolean exitlinkedlist()
{
	return head!=null;
}
public void insertedLinkedList(int value,int location)

{
	SingleNode  singlenode= new SingleNode ();
	singlenode.setNode(value);
	if(!exitlinkedlist()) {
		System.out.println("Linkedlink doesn't exit");
	}
	else if(location==0)
	{
		singlenode.setNext(head);
		head=singlenode;
	}
	else if(location>=size)
	{
		singlenode.setNext(null);
		tail.setNext(singlenode);
		tail=singlenode;
	}
	else
	{
		SingleNode temp=head;
		int index=0;
		while(index<location-1)
		{
			temp=temp.getNext();
			index++;
		}
		SingleNode nextnode=temp.getNext();
		temp.setNext(singlenode);
		singlenode.setNext(nextnode);
		
	}
	setSize(getSize()+1);
	
}
void traverseLinkedList() {
	if (exitlinkedlist()) {
		SingleNode tempNode = head;
		for (int i = 0; i < getSize(); i++) {
			System.out.print(tempNode.getNode());
			if (i != getSize() - 1) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.getNext();
		}
	}else {
		System.out.println("Linked List does not exists !");
	}
	System.out.println("\n");
}
public boolean searchnode(int value)
{
	if(exitlinkedlist())
	{
		SingleNode temp=head;
		for(int i=0;i<getSize();i++)
		{
			if(temp.getNode()==value)
			{
				System.out.println("LinkedList present at location "+i);
				return true;
			}
			temp=temp.getNext();
			
			
		}
		
	}
	else
	{
		System.out.println("Value doesn't exit in LinkedList");
	}
	return false;
}

	
	
	
	public void delete(int location)
	{
		if(!exitlinkedlist())
		{
			System.out.println("List doesn't exits");
		}
		else if(location==0)
		{
			head=head.getNext();
			setSize(getSize()-1);
			if(getSize()==0)
			{
				tail=null;
			}
			
		}
		else if(location>=getSize())
		{
			if(location==getSize())
			{
				SingleNode temp= head;
				for(int i=0;i<size-1;i++)
				{
					temp=temp.getNext();
				}
				if(temp==head)
				{
					tail=head=null;
					setSize(getSize()-1);
					return;
				}
				else
				{
					temp.setNext(null);
					tail=temp;
					setSize(getSize()-1);
				}
			
			
			
		}
		else 
		{
			SingleNode temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.getNext();
			}
			SingleNode prevnode=temp.getNext().getNext();
			temp.setNext(prevnode);
			setSize(getSize()-1);
		}
		}
	}
	public void middlelinkedList()
	
	{
		
		SingleNode temp1=head;
		SingleNode temp2=head;
		if(head!=null)
		{
			while(temp2!=null&&temp2.getNext()!=null)
			{
				temp2.getNext().getNext();
				temp1.getNext();
				
			}
			System.out.println(temp1.getNode());
		}
		
		
		
	}
	public void sumuptozero()
	{
		SingleNode temp=head;
		while(temp.getNext()!=null)
		{
			if(temp.getNode()>=0)
			{
				povnode+=temp.getNode();
				list1.add(temp.getNode());
			}
			else
			{
				negnode+=temp.getNode();
				list2.add(temp.getNode());
			}
		}
		int value=povnode-negnode;
		if(value>0)
		{
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList list= new SingleLinkedList();
		list.createSingleLinkedList(10);
		list.insertedLinkedList(10, 2);
		list.insertedLinkedList(15, 0);
		//list.traverseLinkedList();
		//list.searchnode(15);
		//list.delete(0);
		//list.middlelinkedList();
	}

}
