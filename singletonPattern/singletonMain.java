package singletonPattern;
import java.util.*;
public class singletonMain {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Console User1=Console.getInstance();
        User1.play();
        System.out.println(User1.game);
        User1.game=scanner.nextLine();
        System.out.println(User1.game);
        Console User2=Console.getInstance();
        User2.play();
        System.out.println(User2.game);
    }
}
