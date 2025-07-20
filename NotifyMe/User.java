public class User implements Suscriber {
    private String name;

    public User(String name){
        this.name = name;
    }

    public void update(String videoTitle){
        System.out.println(name + " got notification about "+ videoTitle);
    }
}
