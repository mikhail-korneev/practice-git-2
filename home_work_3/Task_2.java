package home_work.home_work_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Task_2 {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Меркурий", "Венера", "Земля",
                "Марс", "Юпитер", "Сатурн",
                "Уран", "Нептун"
        };

        Random rnd = new Random();
        ArrayList<String> list = new ArrayList<>();
        int listSize = rnd.nextInt(100000, 1000000);
        for (int i = 0; i < listSize; i++) {
            list.add(planets[rnd.nextInt(planets.length)]);
        }

        //System.out.println(list);

        // 1 вариант
        long start = System.currentTimeMillis();
        TreeSet<String> set = new TreeSet<>(list);
        System.out.println("Время выполнения 1 варианта: " + (System.currentTimeMillis() - start));
        System.out.println(set);

        // 2 вариант
        start = System.currentTimeMillis();
        for (int i = 0; i < listSize; i++) {
            for (int j = i + 1; j < listSize; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                    listSize--;
                }
            }
        }
        System.out.println("Время выполнения 2 варианта: " + (System.currentTimeMillis() - start));
        System.out.println(list);
    }
}
