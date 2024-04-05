public class HotelRecord {
    private int roomNumber;
    private int ID_user;
    private String checkInDate;
    private String checkOutDate;


    public HotelRecord(int roomNumber, String checkInDate, String checkOutDate, int ID_user) {
        this.roomNumber = roomNumber;
        this.ID_user = ID_user;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public String getCheckInDate() {
        return checkInDate;
    }


    public String getCheckOutDate() {
        return checkOutDate;
    }


    public int getID_user() {
        return ID_user;
    }

}

