import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы вошли в базу отеля.");
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить нового клиента");
            System.out.println("2. Удалить клиента");
            System.out.println("3. Создать запись в отеле");
            System.out.println("4. Выйти из приложения");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    admin.addUser(scanner);
                    admin.displayUsers();
                    break;
                case 2:
                    admin.deleteUser(scanner);
                    admin.displayUsers();
                    break;
                case 3:
                    admin.addHotelRecord(scanner);
                    admin.displayHotelRecords();
                    break;
                case 4:
                    System.out.println("База отеля закрыта. До свидания!");
                    return;
                default:
                    System.out.println("Некорректное значение. Пожалуйста, выберите действие из списка.");
                    break;
            }

        }
    }
}