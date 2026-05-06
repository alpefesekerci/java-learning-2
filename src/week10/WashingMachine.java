package week10;

class WashingMachine {
    int machineNumber;
    int capacityKg;
    String status;

    public WashingMachine(int machineNumber, int capacityKg) {
        this.machineNumber = machineNumber;
        this.capacityKg = capacityKg;
        this.status = "Bos";
    }

    public void start() {
        this.status = "Dolu";
        System.out.println(this.machineNumber + " makinesi baslatildi.");
    }

    public static void main(String[] args) {
        WashingMachine machine1 = new WashingMachine(1, 9);
        WashingMachine machine2 = new WashingMachine(2, 12);

        System.out.println(machine1.machineNumber + " Numarali makine - Durum: " + machine1.status);

        machine1.start();

        System.out.println("Son durum: " + machine1.status);
    }
}

