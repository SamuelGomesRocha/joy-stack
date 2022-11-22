package br.edu.ifg.app;

import br.edu.ifg.entities.Stack;
import br.edu.ifg.services.StackServices;

import java.util.Scanner;

public class ProgramTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Put your expression: ");
        String expression = s.nextLine();
        Stack leftStack = new Stack();
        Stack rightStack = new Stack();

        for(char c : expression.toCharArray()){

            switch (c){
                case '(':
                    leftStack.push(c);
                    break;
                case '[':
                    leftStack.push(c);
                    break;
                case '{':
                    leftStack.push(c);
                    break;
                case ')':
                    rightStack.push(c);
                    break;
                case ']':
                    rightStack.push(c);
                    break;
                case '}':
                    rightStack.push(c);
                    break;
            }
        }

       System.out.println("A expressão está correta? "+
               new StackServices().verifyExpression(leftStack, rightStack));
    }

}
