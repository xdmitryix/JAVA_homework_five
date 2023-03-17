import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class task_two {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Иван Иванов");
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");
        Collections.sort(list);
        Map <String, Integer> mapList = new HashMap<>();
        addMap(mapList, list);
        sortMap(mapList);

    
    }

    public static void addMap(Map<String, Integer> dat, ArrayList<String> list){
        Integer count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            String nameLastNameOne = list.get(i);
            String nameLastNameTwo = list.get(i+1);
            String[] nameArrOne = nameLastNameOne.split(" ");
            String[] nameArrTwo = nameLastNameTwo.split(" ");
            String nameOne = nameArrOne[0];
            String nameTwo = nameArrTwo[0];  
            if (nameOne.equals(nameTwo)){
                count++;
            }else{
                dat.put(nameOne, count);
                count =1;
            }

        }
    }

    public static void sortMap(Map<String, Integer> dat){
        Map<String, Integer> sortedMap = dat.entrySet().stream() 
        .sorted(Comparator.comparingInt(e -> -e.getValue())) 
        .collect(Collectors.toMap( 
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (a, b) -> { throw new AssertionError(); }, 
        LinkedHashMap::new 
        )); 
        
        sortedMap.entrySet().forEach(System.out::println);  
    }
}