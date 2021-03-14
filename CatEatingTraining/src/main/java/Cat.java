public class Cat {
    private static String name;
    private static int appetite;
    private static boolean satiety;

    public static void setAppetite(int appetite) {
        Cat.appetite = appetite;
    }

    public static int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        if (appetite > 0){
            return false;
        }
        else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void catInfo(){
        System.out.println(getName());
        System.out.println(getAppetite());
        if (isSatiety() == true){
            System.out.println("сытый");
    }else {
            System.out.println("голодный");
        }
    }

}
