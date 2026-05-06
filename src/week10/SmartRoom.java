package week10;

public class SmartRoom {
    private String roomNumber;
    private int temperature;
    private String doorPassword;

    public SmartRoom(String roomNumber, String initialPassword) {
        this.roomNumber = roomNumber;
        this.doorPassword = initialPassword;
        this.temperature = 20;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 15 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println(this.roomNumber + " numarali odanin sicakligi ayarlandi: " + this.temperature + " derece.");
        } else {
            System.out.println("GÜVENLİK UYARISI: " + temperature + " derece gecersiz! Sicaklik sadece 15-30 arasinda olabilir.");
        }
    }
}

class Master {
    public static void main(String[] args) {
        SmartRoom room101 = new SmartRoom("101", "A1B2");
        room101.setTemperature(24);
        room101.setTemperature(1000);
        System.out.println("Odanin su anki sicakligi: " + room101.getTemperature() + " derece.");
    }
}

