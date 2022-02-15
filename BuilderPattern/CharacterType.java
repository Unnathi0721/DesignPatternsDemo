package BuilderPattern;
import java.util.*;
public class CharacterType {
    private List<Build> items=new ArrayList<Build>();
    public void addItem(Build avatar) {
        items.add(avatar);
    }
    public void getCost(){
        for (Build avatar : items) {
            avatar.getVersion();
        }
    }
    public void showItems(){
        for (Build avatar : items){
            System.out.print("Avatar name : "+avatar.getVersion());
            System.out.println(", Score : "+avatar.getScore());
        }
    }
}
