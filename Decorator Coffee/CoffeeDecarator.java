public abstract class CoffeeDecarator implements Coffee {
    protected Coffee coffee ;

    public CoffeeDecarator(Coffee coffee){
        this.coffee = coffee;
    }
}
