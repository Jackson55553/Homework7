public class Plate {
    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (Cat.getAppetite() > food){
        }else {
           Cat.setAppetite(Cat.getAppetite() - n);
           food -= n;
        }
    }

    public static void info() {
        System.out.println("тарелка: " + food);
    }
}