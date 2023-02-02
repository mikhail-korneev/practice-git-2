package home_work.home_work_3;

import java.util.*;

import com.google.common.collect.Ordering;
import com.google.common.math.Stats;

public class Task_1 {
    /**
     * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
     * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
     * 3. Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = newList();
        System.out.printf("1) %s%n", list);
        list.removeIf(x -> x % 2 == 0);
        System.out.printf("Убираем чётные числа: %s%n", list);

        list = newList();
        System.out.printf("2) %s%n", list);
        int max = Collections.max(list);
        System.out.printf("max = %d%n", max);    // или Ordering.natural().max(list)
        int min = Collections.min(list);
        System.out.printf("min = %d%n", min);    // или Ordering.natural().min(list)
        double num = Stats.meanOf(list);
        System.out.printf("Среднее арифметическое = %.2f", num);
    }

    private static ArrayList<Integer> newList() {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int listLength = rnd.nextInt(40, 80);
        for (int i = 0; i < listLength; i++) {
            list.add(rnd.nextInt(20));
        }
        return list;
    }
}
