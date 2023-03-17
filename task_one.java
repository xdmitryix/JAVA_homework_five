import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568


// public class task_one {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         Map<String, List<String>> data = new HashMap<>();
//         List<String> list1 = new ArrayList<String>();
//         // list1.add("123456");
//         // data.put("иванов", list1);
//         // list1.add("222222");
//         // data.put("иванов", list1);
//         // list1.add("333333");
//         // data.put("петров", list1);

//         while (true) {
//             System.out.println("введите команду: 1 - добавление контакта/n 2 - Вывод всех контактов/n");
//             String command = iScanner.nextLine();
//             if (command.equals("1")){
//                 addData(data, list1);
//                 System.out.println("данные добавлены !");
//             }else{
//                 if (command.equals("2")){
//                     System.out.println(data);
//                 }else{
//                     System.out.println("некорректный ввод !");
//                 }
//             }
//         }

//     }

//     public static void addData(Map<String, List<String>> dat, List<String> list){
//         Scanner iScanner2 = new Scanner(System.in, "Cp866");
//         System.out.println("введите фамилию: ");
//         String name = iScanner2.nextLine();
//         System.out.println("введите номер телефона: ");
//         String phone_number = iScanner2.next();
//         if(!dat.isEmpty()){
//             for (Map.Entry<String, List<String>> entry : dat.entrySet()){
//                 if (entry.getKey().equals(name)){
//                     dat.put(phone_number, list<String> ));
//                 }
//             }
//         } 


//         // list.add(phone_number);
//         // dat.put(name, list);
//     }

// }


public class task_one {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, List<String>> data = new HashMap<>();

        // list1.add("123456");
        // data.put("иванов", list1);
        // list1.add("222222");
        // data.put("иванов", list1);
        // list1.add("333333");
        // data.put("петров", list1);

        while (true) {
            System.out.println("введите команду: 1 - добавление контакта/n 2 - Вывод всех контактов/n");
            String command = iScanner.nextLine();
            if (command.equals("1")){
                addData(data);
                System.out.println("данные добавлены !");
            }else{
                if (command.equals("2")){
                    System.out.println(data);
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


        // list.add(phone_number);
        // dat.put(name, list);
    }

}