public class Cream extends CoffeeDecarator{
    public Cream(Coffee coffee) {
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + " Cream";
    }
    public double getCost(){
        return coffee.getCost()+20.0;
    }
    
}
