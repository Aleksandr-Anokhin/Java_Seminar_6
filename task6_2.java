/* 2. Отфильтровать ноутбуки первоначального множества.
По имени ноутбука в алфавитном порядке, по цене по убыванию */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class task6_2 {
    public static void main(String[] args) {
        Notebooks notebook1 = new Notebooks("ACER  ", "8 ", "256 Gb", "Win 10", "Silver", "25000 руб.");
        Notebooks notebook2 = new Notebooks("ASUS  ", "12", "256 Gb", "No OS", "Grey", "30000 руб.");
        Notebooks notebook3 = new Notebooks("Lenovo", "12", "512 Gb", "Win 10", "Dark blue", "45000 руб.");
        Notebooks notebook4 = new Notebooks("MSI   ", "16", "512 Gb", "Linux", "Black", "43000 руб.");
        
        Set<Notebooks> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));

        System.out.println("Выберите действие:\n1 - сортировка по: Бренду\n2 - сортировка по: Цене по убыванию");
        Scanner iScanner = new Scanner(System.in);
        Integer choice = iScanner.nextInt();

        if (choice == 1) {
            System.out.println("|Бренд |ОЗУ |Цена  руб.|");
            notebooks.stream().sorted((p1, p2) -> ((String)p1.getName()).compareTo(p2.getName()))
            .forEach(Laptop -> System.out.println("|" + Laptop.getName() + "|" + Laptop.getRam() + "ГБ|" +
            Laptop.getPrice() + "|"));
            }
            else if (choice == 2) {
                System.out.println("|Бренд |ОЗУ |Цена  руб.|");
                notebooks.stream().sorted((p2, p1) -> ((String)p1.getPrice()).compareTo(p2.getPrice()))
                .forEach(Laptop -> System.out.println("|" + Laptop.getName() + "|" + Laptop.getRam() + "ГБ|" +
                Laptop.getPrice() + "|"));
                }
            else System.out.println("Ошибка ввода");
            iScanner.close();

    }
}