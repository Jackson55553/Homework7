import java.util.Scanner;

public class Plate {
    private static int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite){
            food -= appetite;
        }
    }

    public static void info() {
        System.out.println("тарелка: " + food);
        System.out.println();
    }

    public static void foodIsEmpty(){
        if (food == 0){
            System.out.println("тарелка пуста, добавьте корм");
            System.out.println("Сколько корма добавить?");
            setFood();
        }
    }

    public static void setFood() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Plate.food = i;
    }
}