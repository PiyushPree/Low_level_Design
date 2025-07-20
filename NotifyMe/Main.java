public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        
        Suscriber user1 = new User("Bhanu");
        Suscriber user2 = new User("Riya");

        channel.suscrive(user1);
        channel.suscrive(user2);

        channel.uploadVideo("Welcome to my blog..");
    }
}
