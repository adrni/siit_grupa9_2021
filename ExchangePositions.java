package siit.Homework.Generics;

import java.util.Arrays;
import java.util.List;

public class ExchangePositions {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("a", "b", "cde", "test");
        exchangePosition(integerList,3,4);
        System.out.println("\n");
        exchangePosition(strings,1,2);
    }
//Write a generic method to exchange the positions of two different elements in an array.

    public static void exchangePosition(List<?> list, int index1, int index2){
        System.out.print("Initial list: ");
        for(Object elem:list){
            System.out.print(elem+" ");
        }
        System.out.println("");
        System.out.print("Positions exchanged: ");
        List mylist=list;
        mylist.set(index1,mylist.set(index2,mylist.get(index1)));
        for(Object elem:mylist){
            System.out.print(elem+" ");
        }
        }
    }

