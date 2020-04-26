package com.tree;

//Creating a Binary Search Tree
class Node
{
    Node left;
    Node right;
    int val;
    Node(int val)
    {
        this.left=null;
        this.right=null;
        this.val=val;
    }
}
public class Tree {

    Node root;

    public void addNode(int val)
    {

        Node newNode=new Node(val);
        if(root==null)
        {
            root=newNode;
        }
        else
        {
            Node current =root;
            Node parent;
            while(true)
            {
                parent=current;
                if(current.val<val)
                {
                    current=current.left;
                    if(current==null)
                    {
                        parent.left=newNode;
                        return;
                    }
                }
                else
                {
                    current=current.right;
                    if(current==null)
                    {
                        parent.right=newNode;
                        return;
                    }
                }
            }

        }
    }
    public void traverse()
    {
        Node current =root;
        print(current);
    }
    private void print(Node node)
    {
        if(node==null)
        {
            return;
        }
        print(node.left);
        System.out.println(node.val);
        print(node.right);
    }
public boolean search(int val)
{
    Node current =root;
    while(current!=null)
    {
        if(current.val==val)
        {
            return true;
        }
        else if(current.val<val)
        {
            current=current.left;
        }
        else
        {
            current=current.right;
        }
    }
    return false;
}
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(6);
        tree.addNode(3);
        tree.addNode(11);
        tree.traverse();
        System.out.println(tree.search(5));
        System.out.println(tree.search(50));

    }


}
