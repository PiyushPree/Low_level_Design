public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee(); 

        coffee = new Milk(coffee);
        System.out.println("Order : "+ coffee.getDescription());
        System.out.println("Cost : "+ coffee.getCost());
        coffee = new Cream(coffee);

        System.out.println("Order : "+ coffee.getDescription());
        System.out.println("Cost : "+ coffee.getCost());

    }
}
