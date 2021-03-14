public class TryingEat {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("pushok", 23);
        cats[2] = new Cat("kisa", 46);
        cats[3] = new Cat("ponchik", 26);
        cats[4] = new Cat("sok", 150);
        Plate plate = new Plate(200);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.catInfo();
            Plate.info();
        }
    }

}
