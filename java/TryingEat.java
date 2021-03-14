public class TryingEat {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("pushok", 23);
        cats[2] = new Cat("kisa", 46);
        cats[3] = new Cat("ponchik", 1);
        cats[4] = new Cat("sok", 1);
        Plate plate = new Plate(70);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
        cats[i].eat(plate);
        cats[i].catInfo();
        plate.info();
        plate.foodIsEmpty();
        }
        plate.info();
    }

}
