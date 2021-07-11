package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamMain streamMain = new StreamMain();
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (i > 0 && i % 2 == 0) newList.add(i);
        }
        int[] array = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            array[i] = newList.get(i);
        }
        Arrays.sort(array);
        System.out.println("Вывод без использования Stream API:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\nВывод со Stream API:");
        streamMain.streamCount();
    }
}
