public class Milk extends CoffeeDecarator{
    public Milk(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + " Milk";
    }
    public double getCost(){
        return coffee.getCost()+10.0;
    }
}
