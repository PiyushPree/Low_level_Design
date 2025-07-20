import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Suscriber> suscriverList = new ArrayList<>(); 

    public void suscrive(Suscriber s){
        suscriverList.add(s);
    }
    public void unSuscrivbe(Suscriber s){
        suscriverList.remove(s);
    }

    public void uploadVideo(String title){
        System.out.println("Video Uploaded " + title);

        for(Suscriber sus : suscriverList){
            sus.update(title);
        }
    }
}
