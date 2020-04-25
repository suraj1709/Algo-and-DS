package com.linkedlist;
class Node
{
    Node next;
    int val;
     Node(int val)
    {   next=null;
        this.val=val;
    }
}
class LinkedList {
    Node head=null;
    Node tail= null;
    public void add(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;

        }

    }
    public void showlist(Node current)
    {

        while(current!=null)
        {
            System.out.print("--"+current.val+"--");
            current=current.next;
        }
    }
    public  boolean search(int val)
    {
        Node current =head;
        while(current!=null)
        {
            if(current.val==val)
            {
                return true;
            }

        }
        return false;
    }

    public void reverseaLinkedList()
    {
        Node current =head;
        Node node1=null;
        while (current!=null)
        {
            Node temp=current.next;
            current.next=node1;
            node1=current;
            current=temp;

        }
        showlist(node1);
    }
    public  void midOfLinkedList()
    {

        Node low=head;
        Node high =head;
        while(high!=null && high.next!=null)
        {
           low=low.next;
           high=high.next.next;
        }
        System.out.println(low.val);

    }
    public Node convertArraytoLinkedList(int[] arr)
    {
        Node startlist=null;
        Node endlist=null;
        for(int i:arr)
        {
            Node val=new Node(i);
            if(startlist==null)
            {
                startlist=val;
                endlist=val;
            }
            else {
                endlist.next = val;
                endlist = val;
            }
        }
        return startlist;
    }
    public boolean checkOfPalindrome(Node list)
    {
        Node low=list;
        Node high =list;
        while(high!=null && high.next!=null)
        {
            low=low.next;
            high=high.next.next;
        }
        Node current =low;
        Node node1=null;
        while (current!=null)
        {
            Node temp=current.next;
            current.next=node1;
            node1=current;
            current=temp;

        }
        while(node1!=null)
        {
            if(list.val!=node1.val)
            {
                return false;
            }
            list=list.next;
            node1=node1.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList lk= new LinkedList();
        lk.add(10);
        lk.add(20);
        lk.add(30);
        lk.add(40);
        lk.add(50);
        lk.add(60);
        int[] arr={20,30,40,30};
        System.out.println(lk.checkOfPalindrome(lk.convertArraytoLinkedList(arr)));
        lk.midOfLinkedList();
        lk.reverseaLinkedList();


    }

}
