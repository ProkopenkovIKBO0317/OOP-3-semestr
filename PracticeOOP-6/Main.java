package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choice;
        String name;
        int id;
        List<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Добавить новый объект в массив");
            System.out.println("2 - Сортировка пузырьком");
            System.out.println("3 - Вывести массив на экран");
            System.out.println("4 - Выход из программы");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    name = sc.next();
                    System.out.print("Введите номер ID студента: ");
                    id = sc.nextInt();
                    Student obj = new Student(name, id);
                    arr.add(obj);
                    break;

                case 2:
                    if (arr.size() != 0) {
                        bouble_sort_array(arr, arr.size());
                    }
                    else {
                        System.out.println("Массив пуст!");
                    }
                    break;
                case 3:
                    if (arr.size() != 0) {
                        for (int i = 0; i < arr.size(); i++) {
                            arr.get(i).show();
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("Массив пуст!");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    public static void bouble_sort_array(List<Student> arr, int size) {
        Student temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr.get(i).getId() > arr.get(j).getId()) {
                    temp = arr.get(i);
                    arr.set(i, (arr.get(j)));
                    arr.set(j, temp);
                }
            }
        }
    }
}
