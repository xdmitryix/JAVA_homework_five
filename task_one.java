import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции: 
// 1) Добавление номера
// 2) Вывод всего

public class task_one {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, List<String>> data = new HashMap<>();
        while (true) {
            System.out.println("введите команду: 1 - добавление контакта. 2 - Вывод всех контактов.");
            String command = iScanner.nextLine();
            if (command.equals("1")){
                addData(data);
                System.out.println("данные добавлены !");
            }else{
                if (command.equals("2")){
                    for (Map.Entry<String, List<String>> pair : data.entrySet()) {
                        System.out.println(String.format(pair.getKey() + " : " + pair.getValue()));   
                    }
                }else{
                    System.out.println("некорректный ввод !");
                }
            }
        }

    }

    public static void addData(Map<String, List<String>> dat){
        Scanner iScanner2 = new Scanner(System.in, "Cp866");
        System.out.println("введите фамилию: ");
        String name = iScanner2.nextLine();
        System.out.println("введите номер телефона: ");
        String phone_number = iScanner2.next();
        List<String> list1 = dat.get(name);
        if (list1 == null) {
            list1 = new ArrayList<String>();
            dat.put(name, list1);
        }
        list1.add(phone_number);
    }

}