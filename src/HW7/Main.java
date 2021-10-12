package HW7;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[]{new Cat("Barsik"), new Cat(" Tolik "), new Cat("Murzik")};
        Plate plate = new Plate(150);

        plate.info();
        cat[0].info();
        plate.info();
        cat[1].info();
        plate.info();
        cat[2].info();

        while (true) {
            for (int i = 0; i < 3; i++) {
                if (plate.getFood() >= cat[i].getAppetite()) {
                    cat[i].eat(plate);

                    plate.info();
                    cat[i].info();

                }
                if (plate.getFood() < cat[i].getAppetite()) {
                    System.out.println("Еды недостаточно!");
                    plate.addFood(50);
                    plate.info();
                    return;
                }
            }
        }

    }
}
