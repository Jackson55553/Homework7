public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
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
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void catInfo() {
        System.out.println(getName());
        System.out.println(getAppetite());
        if (satiety == true){
            System.out.println("сытый");
        }else {
            System.out.println("голодный");
        }
    }
    }
