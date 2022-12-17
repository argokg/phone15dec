public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1234,"Iphone", 125.0);
        Phone phone2 = new Phone(4321, "Samsung", 130.2);
        Phone phone3 = new Phone(5678, "Xiaomi", 145.5);
//        System.out.println(phone1);
//        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("---------------");
        phone3.receiveCall("Садыр");
        phone3.getNumber(111111111);
        phone3.receiveCall("David", 131564631);
        System.out.println("---------------");
        int[] number = {555222222, 54641354, 2589789};
        phone3.sendMessage(number);

    }
}