package org.example.junitexample;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int  addition(int n1, int n2){
        return n1 + n2 ;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2 ;

    }
    public boolean isEven(int num) {
        return num%2 == 0;
    }

    public List<Integer> getEvenNumbers(List<Integer> inputArray) {
        List<Integer> resultArray = new ArrayList<>();
        if(inputArray.isEmpty()){
            System.out.println("Given input array is empty");
            return resultArray;
        }
        for(int num:inputArray) {
            if(isEven(num)){
                resultArray.add(num);
            }

        }
        return resultArray;
    }
}
