package DailyQuiz.DailyQuiz6;

public class LargeAppliance extends Product{
    public LargeAppliance(String name, int price, double weight) {
        super(name, price, weight);
    }

    public int getPrice(){
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

