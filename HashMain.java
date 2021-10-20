package com.company1.Day15_HashTablePracticeProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMain {
    public static void main(String[] args) {
        int count = 0;
        int slot = 6;

        Operation operation = new Operation();
        String str = "To be or not to be";

        String[] split = operation.splitString(str);

        Object MyMapNode[] = new Object[slot];

        for (int i = 0; i < slot; i++) {
            MyMapNode[i] = new ArrayList<Integer>();
        }

        System.out.println(Arrays.toString(split));

        for (int i = 0; i <= split.length; i++) {

            String str2 = split[i];
            for (int j = 0; j < split.length; j++) {
                if (str2.equals(split[j]))
                    count++;
            }
            operation.add(count, MyMapNode[i]);

            count = 0;
            if (i == 5) {
                break;
            }
        }

        for (int i = 0; i < split.length; i++) {
            operation.print(MyMapNode[i], split[i]);

            if (i == 5) {
                break;
            }
        }
    }
}
