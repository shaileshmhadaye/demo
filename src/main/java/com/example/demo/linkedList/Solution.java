package com.example.demo.linkedList;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Solution {

    public static  Node insert(Node head,int data) {
        Node temp;
        if (head == null)
            return new Node(data);
        else {
            temp = head;
            while (temp.next != null){
                temp=temp.next;
            }
            temp.next = new Node(data);
            System.out.println("node=="+temp.data);
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) throws Exception {
        Node head = null;
        int N = 4;
        Stack stack = new Stack();
        Queue queue = new PriorityQueue();
        
        System.out.println(Math.pow(N, 3));
        while(N-- > 0) {
            int ele = N+3;
            System.out.println("---in while loop --ele="+ele);
            head = insert(head,ele);
        }
        display(head);
    }
}
