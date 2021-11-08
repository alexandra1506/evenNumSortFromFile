package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Сортировка четных чисел из файла
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = reader.readLine();// файл откуда берем строки с числами
        reader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName)));

        List <Integer> list = new ArrayList<>();
        while(fileReader.ready()) {
            int i = Integer.parseInt(fileReader.readLine());
            if (i % 2 == 0)
                list.add(i);
        }

        Collections.sort(list); // сортировка по возрастанию

        for(Integer n : list){
            System.out.println(n);
        }
        fileReader.close();
    }
}
