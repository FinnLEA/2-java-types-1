package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке

        String newStr = new StringBuilder(String.valueOf(value)).reverse().toString();
        return Integer.valueOf(newStr).intValue();
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = reverse(345);
        System.out.println(result);

    }


}
