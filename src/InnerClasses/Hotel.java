package InnerClasses;

public class Hotel {
    private String name;
    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numberOfRooms) {

        // this is local class
        class ReservationValidator {
            boolean validate() {
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be blank");
                    return false;
                }
                if(numberOfRooms <= 0){
                    System.out.println("Number of rooms must be greater than 0");
                    return false;
                }
                if(reservedRooms + numberOfRooms > totalRooms) {
                    System.out.println("Not enough rooms available to reserve");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()) {
            System.out.println("Reservation has been reserved");
            reservedRooms += numberOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numberOfRooms + " rooms");

        } else {
            System.out.println("Rerservation failed");
        }
    }
}
