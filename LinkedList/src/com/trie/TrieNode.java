package com.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieNode {
    public class Node
    {
        Map<Character,Node> child;
        boolean endofWorld;
        public Node()
        {
            child = new HashMap<Character, Node>();
            endofWorld = false;
        }
    }
    public final Node root;
    public TrieNode()
    {
       root= new Node();

    }

    // NEXT WORD IF PRESENT OR NOT IN TRIE DataStructure
    // USER INPUT IS "AB"
    //In Trie if data is present next to "AB" word then return true else false
    public void insertWord(String word)
    {
        Node current =root;
        for(Character ch : word.toCharArray())
        {
            Node node=current.child.get(ch);
            if(node==null)
            {
                node=new Node();
                current.child.put(ch,node);

            }
            current=node;
        }
        current.endofWorld=true;
    }
    // NEXT WORD IF PRESENT OR NOT IN TRIE DataStructure
    // USER INPUT IS "AB"
    //In Trie if data is present next to "AB" word then return true else false
    public boolean searchWord(String words)
    {
        Node current = root;
        for(Character ch : words.toCharArray())
        {
            Node node= current.child.get(ch);
            if(node==null)
            {
                return false;
            }
            current=node;

        }
        return current.endofWorld;
    }
    // NEXT Suffix WORD IF PRESENT OR NOT IN TRIE DataStructure
    // USER INPUT IS "AB"
    //In Trie if data is present next to "AB" word then return true else false
    public boolean seacrhByPrefix(String word)
    {
        Node current=root;
        for(Character ch: word.toCharArray())
        {
            Node node=current.child.get(ch);
            if(node==null)
            {
                return false;
            }
            current =node;
        }
        return true;

    }

    // NEXT WORD IF PRESENT IN THE GIVEN WORD
    // USER INPUT IS "AB"
    //In Trie if data is present next to "AB" word then return the list of word
    //Return ["ABC","ABD","ABRT"]
    public List<String> nextChar(String word)
    {
        Node current=root;
        List<String> list= new ArrayList<>();
        for(Character ch: word.toCharArray())
        {
            Node node=current.child.get(ch);
            if(node==null)
            {
                list.add(word);
                return list;
            }
            current =node;
        }
        Map<Character,Node> map=current.child;
            for (Character c : map.keySet()) {
                list.add(word + c.toString());
            }

        return list;

    }

}
