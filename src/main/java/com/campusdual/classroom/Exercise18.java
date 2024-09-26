package com.campusdual.classroom;

public class Exercise18 {
    public static void main(String[] args) {
        showInlineArray(createAndInitializeArray(4));
    }

    public static int[] createAndInitializeArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void showInlineArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("numero" + array[i]);
            if (i < array.length - 1) {
                System.out.println(" ");
            }
        }
    }
}
