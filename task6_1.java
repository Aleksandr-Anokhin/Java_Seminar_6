/* 1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку:
 имя ноутбука и выбранный критерий.
 Критерии фильтрации можно хранить в Map. 
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task6_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Notebooks notebook1 = new Notebooks("ACER", "8", "256 Gb", "Win 10", "Silver", "25000 руб.");
        Notebooks notebook2 = new Notebooks("ASUS", "12", "256 Gb", "No OS", "Grey", "30000 руб.");
        Notebooks notebook3 = new Notebooks("Lenovo", "12", "512 Gb", "Win 10", "Dark blue", "45000 руб.");
        Notebooks notebook4 = new Notebooks("MSI", "16", "512 Gb", "Linux", "Black", "43000 руб.");
        
        Set<Notebooks> notebooks = new HashSet<>(Notebooks.asList(notebook1, notebook2, notebook3, notebook4));
        // Ошибка(подчеркнуто всё после знака =): Cannot infer type arguments for HashSet<>Java(16778094)

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
        
        System.out.println("Выберите номер критерия: \n 1 - Название производителя \n 2 - Объем ОЗУ \n 3 - Объем Жесткого Диска \n 4 - Операционная система \n 5 - Цвет \n 6 - Цена");
        String key = scanner();
        
        resultCriterias.put(key);
        // Ошибка для put: The method put(String, String) in the type Map<String,String> is not applicable for the arguments (String)Java(67108979)

        return resultCriterias;
    }
        
    public static void sort(Map<String, String> criterias, Set<Notebooks> notebooks) {

        Set<Notebooks> temp = new HashSet<>(notebooks);
        for (Notebooks notebook : notebooks) {          
            for (Object pair1 : criterias.keySet()) {          
                if (pair1.equals("1") && !notebook.getName().equals(criterias.get(pair1))) {
                    temp.remove(notebook);
                }
                for (Object pair2 : criterias.keySet()) {          
                    if (pair2.equals("2") && !notebook.getRam().equals(criterias.get(pair2))) {
                        temp.remove(notebook);          
                    }
                    for (Object pair3 : criterias.keySet()) {          
                        if (pair3.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair3))) {
                               temp.remove(notebook);          
                        }
                        for (Object pair4 : criterias.keySet()) {          
                            if (pair4.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair4))) {
                                temp.remove(notebook);          
                            }
                            for (Object pair5 : criterias.keySet()) {          
                                if (pair5.equals("5") && !notebook.getColour().equals(criterias.get(pair5))) {
                                    temp.remove(notebook);
          
                                }
                                for (Object pair6 : criterias.keySet()) {          
                                    if (pair6.equals("6") && !notebook.getPrice().equals(criterias.get(pair6))) {
                                        temp.remove(notebook);
              
                                    }
                                }
                            }
                        }
                    }
                }
            }
          
        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
            } else {
                System.out.println("Вот что мы можем предложить: \n" + temp.toString());
            }
          
    }
}
  

