package com.company;
import java.util.Scanner;

//Unit3
//Array

public class Main {

    public static void main(String[] args) {

        //Task 3.1.4
        /*Напишите программу, в которой будет массив,
        заполненный элементами от 5 до 15, и напечатайте все элементы массива.*/

        int[] array = new int[11]; // сейчас array содержит одни нули
        int value = 5; // первое значение для массива array
        for (int i = 0; i < array.length; i++) { // обходим весь массив, начиная с 0-го индекса
            array[i] = value; // присваиваем ячейке значения value
            value++; // увеличиваем value на 1 каждый раз (5, 6, 7, ..., 15)
        }
        for (int item : array) { // равносильно (int i = 0; i < array.length; i++)
            System.out.println(item); //печатаем элемент массива
        }

        //Task 3.2.1
        /*Напишите код, который позволяет из строки,
        содержащей значение "Sometimes",
        напечатать третий символ этого слова.*/

        String sometimes = "Sometimes";
        System.out.println(sometimes.charAt(2));

        //Task 3.2.2
        /*Можно ли пользователю выбрать себе имя "Иван Иванов",
        если уже есть другой пользователь с именем "иван иванов",
        считая, что регистр важен для вашей системы?
        Напишите код, который сравнивает эти имена и выводит результат сравнения.*/

        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        System.out.print(user1.equals(user2));

        //Task 3.2.3
        /*Можно ли пользователю выбрать себе имя "Иван Иванов",
        если уже есть другой пользователь с именем "иван иванов",
        считая, что регистр НЕ важен для вашей системы?
        Напишите код, который сравнивает эти имена и выводит результат сравнения.
        В задании используйте методы из таблицы выше.*/

        String user3 = "иван иванов";
        String user4 = "Иван Иванов";
        System.out.print(user3.equalsIgnoreCase(user4));

        //Task 3.2.4
        /*Измените код из предыдущего задания так, чтобы в случае совпадения имен пользователей
        (без учета регистра) выводился ответ: "Выберите другое имя пользователя",
        а если имена не совпадают, выводится ответ: "Отличное имя!".
        В задании используйте методы из таблицы выше.*/

        String user5 = "иван иванов";
        String user6 = "Иван Иванов";
        if(user5.equalsIgnoreCase(user6)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");


        //Task 3.2.5
        /*Измените код из предыдущего задания так,
        чтобы вся проверка имени была выделена в отдельный метод с именем,
        например checkUserName().*/

        String user7 = "иван иванов";
        String user8 = "Иван Иванов";
        checkUserName(user7,user8);

        //Task 3.2.6
        /*Измените код из предыдущего задания так, чтобы в случае,
        если имя пользователя уникальное, пользователю также сообщалось бы
        "Ваше имя имеет длину <длина имени> символов", где вместо <длина имени>
        стоит соответствующее число.
        Проверьте, что ваша программа работает корректно, заменив имя "Иван" на другое,
        например "Вован". В задании используйте методы из таблицы выше.*/

        String user9 = "иван иванов";
        String user10 = "Вован Иванов";
        checkUserName2(user9,user10);

        //Task 3.2.7
        /*Измените код из предыдущего задания так, чтобы после надписи о длине имени добавлялось замечание
        "А без пробелов ваше имя занимает <число> символов". Организуйте код таким образом,
        чтобы даже если имя состоит из трех слов, программа работала корректно.
        В задании используйте методы из таблицы выше.*/

        String user11 = "иван иванов";
        String user12 = "Вован Иванов";
        checkUserName3(user1,user2);


        //Task 3.2.8
        /*Форматирование строк
        Иногда нам нужно передавать в строки различные переменные,
        и не всегда удобно это делать при помощи конкатенации.
        Чтобы это исправить, у нас есть инструменты для форматирования,
        их и рассмотрим в этом скринкасте.*/

        String name = "Gala";
        int age = 18;
        String status = "Studentka";
        String result = String.format("Познакомьтесь, это %s, ей %d, она %s.", name,  age, status);
        System.out.println(result);

        //Task 3.2.8(1)
        /*Пользуясь таблицей методов для изменения строк, представленной выше в этом юните,
        реализуйте метод, который будет удалять из строки все пробелы, но уже с использованием новых методов.
        В этом задании нельзя использовать посимвольный обход слова.*/

        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

        //Task 3.2.8(2)
        /*Напишите метод, который будет проверять, корректно ли пользователь ввёл полное имя.
        Не все написанное в методе main может быть вам понятно, и это нормально
        (позднее мы будем разбирать эти конструкции), ваша задача — сосредоточиться на написании метода.
        Нужно будет проверить, что во введённой строке 3 слова
        (если имя, фамилия или отчество пишутся через дефис, то это считается за одно слово).
        Если пользователь ввёл имя некорректно, например, в нём 2 или 4 и более слов,
        то нужно вывести сообщение с просьбой ввести имя ещё раз.
        */

        System.out.println("Введите Ф.И.О (3 слова): ");
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name2 = scanner.nextLine();
            isCorrectName = checkName(name2);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }

        //Task 3.2.8(3)
        /*Добавьте некоторые улучшения в метод из предыдущего задания.
        Сделайте так, чтобы имя пользователя форматировалось по следующим правилам:
        Самое короткое слово в имени должно быть на первом месте, а самое длинное — на последнем,
        то есть отсортируйте слова в имени по длине.
        Сделайте так, чтобы каждое слово в имени было написано с большой буквы.*/

        System.out.println("Введите Ф.И.О (3 слова): ");
        Scanner scanner1 = new Scanner(System.in);
        boolean isCorrectName1 = false;
        while (!isCorrectName1) {
            String name2 = scanner1.nextLine(); //Считывает строку из System.in
            isCorrectName1 = checkName(name2);
            if (!isCorrectName1) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name2));
            }
        }

        //Task 3.3.1
        /*Расставьте модификаторы доступа так, чтобы код запустился*/

        String affirmation = VariableClass.iwont + " looser, " + VariableClass.iwill + " developer";
        System.out.println(affirmation);
    }

    private static void checkUserName(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
    private static void checkUserName2(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
        }
    }
    private static void checkUserName3(String user1, String user2) {
        String user2copy = user2.replace(" ","");
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
            System.out.println("А без пробелов ваше имя имеет занимает " + user2copy.length() + " символов");
        }
    }

    private static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }
}
