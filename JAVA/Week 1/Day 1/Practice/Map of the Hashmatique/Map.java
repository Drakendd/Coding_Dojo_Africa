import java.util.HashMap;
import java.util.Set;
public class Map {
    public static void main(String[] args){
        HashMap<String, String> songs = new HashMap<String, String>();
            songs.put("waka waka","waka waka eeee");
            songs.put("please no","you can leave please ");
            songs.put("like"," mother lover the big three it s just big me ");
            songs.put("7year old","when i was 7 years old");
        
            System.out.println(songs.get("Blue"));

        Set<String> keys = songs.keySet();
        for (String key : keys){
            System.out.println(key+":"+songs.get(key));
        }
    }
}
