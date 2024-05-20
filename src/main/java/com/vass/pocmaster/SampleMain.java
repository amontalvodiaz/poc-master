package com.vass.pocmaster;

import java.util.ArrayList;
import java.util.List;

public class SampleMain {

    public static void main(String[] args) {

    }

    public static int countAs(String value){
        int counter = 0;
        for(char letter: value.toCharArray()){
            if(letter == 'a' || letter == 'A' ){
                counter++;
            }
        }
        return counter;
    }

    public static boolean validateParenthesis(String value) {
        List<String> openParenthesis = new ArrayList<>();
        for (char letter: value.toCharArray()){
            if(letter == '('){
                openParenthesis.add(String.valueOf(letter));
            }
            if(letter == ')'){
                if(openParenthesis.isEmpty()){
                    return false;
                }
                openParenthesis.remove(0);
            }

        }
        return openParenthesis.isEmpty();
    }
}
