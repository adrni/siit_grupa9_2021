package siit.Homework.Generics;

import java.util.Arrays;
import java.util.List;

public class MaximalElement {
    //Write a generic method that finds the maximal element from a list
    public static void main(String[] args) {
        findMax(Arrays.asList(-1, -2, -30, -4, -5, -6, -7, -1, -10));
        findMax(Arrays.asList(-1.1D, -1.2D, -30D, -4D, -5.1D, -5.2D, -7D, -1.3D, -10D));
        findMax(Arrays.asList(-100.8F, -23.7F, -30.6F, -400F, -5.0009F, -6.03F, -7F, -1000F, -10F));
        findMax(Arrays.asList(-1, -2, -30, -4, 5, Integer.MAX_VALUE, -7, -1, -10));
    }

    public static void findMax(List<? extends Comparable> list) {
        Comparable max = list.get(0);
        for (Comparable elem : list) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        System.out.println("Max from list: "+max);
    }
}
