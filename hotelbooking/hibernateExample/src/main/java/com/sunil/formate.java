package com.sunil;

import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Queue{
    
    int q[];
    int front, rear, size;
    
    public Queue(int n){
        size = n+1;
        q = new int[n+1];
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty(){
        if(rear == -1)
        return  true ;
        else 
        return false;
        
    }
    
    public boolean isFull(){
        return front ==0 && rear == size-1;
    }
    
    public void inset(int i){
        if(rear == -1){
            front = 0 ;
            q[++rear] =i;
        } else if(rear +1 >= size) {
            throw new java.lang.IndexOutOfBoundsException("Overflow");
        } else {
            q[++rear] =i;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        throw new java.util.NoSuchElementException("UnderFlow");
    } else {
        int ele = q[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else 
          front ++;
          return ele;
    }
    }
    public void display(){
    	for(int i = 0; i< size ;i++)
       System.out.print(q[i]+" ");
    }
}

class formate {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/

        //Scanner
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());                 // Reading input from STDIN
        Queue qe = new Queue(n);
        
        String list[] = s.nextLine().split(" ");
        for (String value : list) {
            qe.inset(Integer.parseInt(value));
        }
        
        int flag = Integer.parseInt(s.nextLine());
        if(flag == 1){
            int value = Integer.parseInt(s.nextLine());
        qe.inset(value);
        }
        
        qe.display();
           // Writing output to STDOUT

        

        // Write your code here

    }
}
