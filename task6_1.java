/* 1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку:
 имя ноутбука и выбранный критерий.
 Критерии фильтрации можно хранить в Map. 
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class task6_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Notebooks notebook1 = new Notebooks("ACER", "8", "256 Gb", "Win 10", "Silver", "25000 руб.");
        Notebooks notebook2 = new Notebooks("ASUS", "12", "256 Gb", "No OS", "Grey", "30000 руб.");
        Notebooks notebook3 = new Notebooks("Lenovo", "12", "512 Gb", "Win 10", "Dark blue", "45000 руб.");
        Notebooks notebook4 = new Notebooks("MSI", "16", "512 Gb", "Linux", "Black", "43000 руб.");
        
        Set<Notebooks> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));
        // 

        Map<String, String> sel = selectCriteria();
        sort(sel, notebooks);    
    }

    public static String scanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            String scan = scanner.nextLine();
            return scan;
        }
    }
  
     public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();     
        
        System.out.println("Выберите номер критерия: \n 1 - Объем ОЗУ \n 2 - Объем Жесткого Диска \n 3 - Операционная система \n 4 - Цвет \n 5 - Цена");
       
        String value = scanner();

        
        resultCriterias.put("1", value);
        // 

        return resultCriterias;
    }
    public static void ShowMapLaptops(Map<String, Object> map, String param) {
        Map<String,Object> sortedMap = new TreeMap<>(map);
        for (Map.Entry<String, Object> el : sortedMap.entrySet()) {
            System.out.println("| " + el.getKey() + " | " + el.getValue() + param + " | ");
        }
    }
    public static Map<String, Object> getAllRAM(Set<Notebooks> list) {
        Map<String, Object> lapRam = new HashMap<>();
        for (Notebooks el : list) {
            lapRam.put(el.getName(), el.getRam()); // геттеры для получения значения полей
        }
        ShowMapLaptops(lapRam, " ГБ");//вывод красивый
        return lapRam;
    }

    public static void sort(Map<String, String> criterias, Set<Notebooks> notebooks) {

       
        if (criterias.values().contains("1"))
            getAllRAM(notebooks);
        else if (criterias.values().contains("2"))
            getAllRAM(notebooks);
                 
    }

    
}
  
