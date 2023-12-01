import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringCollectionOperations operations = new StringCollectionOperations();
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Заполнить коллекцию строками");
            System.out.println("2. Добавить строку в коллекцию");
            System.out.println("3. Удалить строку из коллекции");
            System.out.println("4. Найти одинаковые элементы в коллекции");
            System.out.println("5. Реверс всех строк в коллекции");
            System.out.println("6. Статистика по символам в строках коллекции");
            System.out.println("7. Поиск подстроки в коллекции");
            System.out.println("8. Статистика по длине строк в коллекции");
            System.out.println("9. Вывести коллекцию в упорядоченном виде");
            System.out.println("10. Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Введите строки через запятую:");
                    String input = scanner.nextLine();
                    String[] strings = input.split(",");
                    operations.fillCollection(strings);
                    break;
                case 2:
                    System.out.println("Введите строку для добавления:");
                    String newString = scanner.nextLine();
                    operations.addString(newString);
                    break;
                case 3:
                    System.out.println("Введите строку для удаления:");
                    String stringToRemove = scanner.nextLine();
                    operations.removeString(stringToRemove);
                    break;
                case 4:
                    System.out.println(operations.findDuplicateStrings());
                    break;
                case 5:
                    operations.reverseStrings();
                    break;
                case 6:
                    System.out.println(operations.getCharactersStatistics());
                    break;
                case 7:
                    System.out.println("Введите подстроку для поиска:");
                    String substring = scanner.nextLine();
                    System.out.println(operations.searchSubstring(substring));
                    break;
                case 8:
                    System.out.println(operations.getLengthStatistics());
                    break;
                case 9:
                    operations.printOrderedResults();
                    break;
                case 10:
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}

