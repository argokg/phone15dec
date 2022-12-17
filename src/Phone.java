public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.printf("Звонит %s", name);
    }
    public void getNumber(int i) {
        System.out.println("\nНомер телефона: "+i);
    }
    public void receiveCall(String name, int number){
        System.out.printf("Звонит %s, номер телефона: %d\n", name, number);
    }

    public void sendMessage (int[] number){
        for(int a: number){
            System.out.print("\nСалам!" + a);
        }
    }



    @Override
    public String toString() {
        return "Номер: " + number +
                "\nМодель: " + model +
                "\nВес: " + weight;
    }




}
