package br.edu.ifg.entities;

public class Stack {

    private int top;
    private char[] elements;

    public Stack(){
        elements = new char[30];
        top = -1;
    }

    public void push(char e){
        top++;
        elements[top] = e;
    }

    public char pop(){
        char e = elements[top];
        top--;
        return e;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == 29);
    }

    public char top(){
        return elements[top];
    }

    public char getByIndex(int index){
        return elements[index];
    }

    public void print(){
        for(int i = 0; i < top+1; i++){
            System.out.print(elements[i]);
        }
    }

    public int size(){
        return top+1;
    }

    public void updateTop(int i){
        this.top-=i;
    }

}
