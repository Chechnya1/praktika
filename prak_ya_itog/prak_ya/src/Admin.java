import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private int id;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<HotelRecord> hotelRecords = new ArrayList<>();

    public Admin(int id) {
        this.id = id;
    }

    public void addUser(Scanner scanner) {
        System.out.print("Введите ID нового клиента: ");
        int newUserId = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        System.out.print("Введите ФИО нового клиента: ");
        String newName = scanner.nextLine();
        System.out.print("Введите телефон нового клиента: ");
        String newPhone = scanner.nextLine();
        System.out.println("Введите email нового клиента: ");
        String newemail = scanner.nextLine();

        User newUser = new User(newUserId, newName, newPhone, newemail);
        users.add(newUser);
    }

    public void deleteUser(Scanner scanner) {
        System.out.print("Введите ID клиента для удаления: ");
        int userId = scanner.nextInt();
        users.removeIf(user -> user.getId() == userId);
        System.out.println("Клиент удалён!");
    }

    public void addHotelRecord(Scanner scanner) {
        System.out.print("Введите номер комнаты: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Дата заселения: ");
        String checkInDate = scanner.nextLine();
        System.out.print("Дата выселения: ");
        String checkOutDate = scanner.nextLine();
        System.out.println("Введите ID клиента: ");
        int ID_user = scanner.nextInt();

        HotelRecord newRecord = new HotelRecord(roomNumber, checkInDate, checkOutDate, ID_user );
        hotelRecords.add(newRecord);
    }

    public void displayUsers() {
        System.out.println("Список клиентов:");
        for (User user : users) {
            System.out.println("ID:" + user.getId() + " ФИО:" + user.getName() + " Номер телефона:" + user.getPhone() + "email:" + user.getEmail());
        }
    }

    public void displayHotelRecords() {
        System.out.println("Записи в отеле:");
        for (HotelRecord record : hotelRecords) {
            System.out.println( "Номер комнаты: "+ record.getRoomNumber() + ", ID клиента:" + record.getID_user()  + ", Дата заселения: " + record.getCheckInDate() + ", Дата выселения: " + record.getCheckOutDate());
        }
    }
}