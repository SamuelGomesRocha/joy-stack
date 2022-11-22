package br.edu.ifg.services;

import br.edu.ifg.entities.Stack;

public class StackServices {


    public boolean verifyExpression(Stack s1, Stack s2){
        boolean validation = false;
        System.out.println("Size: "+s1.size()+" "+ s2.size());
        if(s1.size() != s2.size()) return false;
            else{
                for(int i = 0, j = s1.size()-1; i < s1.size(); i++, j--){
                        if (s1.getByIndex(i) == '(') {
                            System.out.println("trem c: " + (int) s1.getByIndex(i) + " " + (int) (s2.getByIndex(j) -1));
                            System.out.println("next: "+ (int) s1.getByIndex(i+1));
                            if ((int) s1.getByIndex(i) == (int) s2.getByIndex(j) - 1)
                                validation = true;
                            else {
                                validation = false;
                                break;
                            }
                        } else {
                            if (s2.getByIndex(j) == ')') {
                                System.out.println("trem a : " + (int) s1.getByIndex(i) + " " + (s2.getByIndex(j) - 1));
                                if ((int) s1.getByIndex(i) == (int) s2.getByIndex(j) - 1)
                                    validation = true;
                                else {
                                    validation = false;
                                    break;
                                }

                            } else {
                                System.out.println("trem b: " + (int) s1.getByIndex(i) + " " + (s2.getByIndex(j) - 2));
                                if ((int) s1.getByIndex(i) == (int) s2.getByIndex(j) - 2)
                                    validation = true;
                                else {
                                    validation = false;
                                    break;
                                }
                            }
                        }
                }

            }

        return validation;
    }

}
