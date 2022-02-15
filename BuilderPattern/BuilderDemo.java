package BuilderPattern;
import java.util.*;
public class BuilderDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("1.Ahri \t 2.Akali \t 3.Evelynn\n Enter your Choice : ");
        int choice=scanner.nextInt();
        scanner.nextLine();
        System.out.print("1.Calibrum \t 2.Severum \t 3.Gravitum\n Enter weapon of your choice : ");
        String weapon=scanner.nextLine();
        System.out.print("1.Thunder \t 2.Fire \t 3.Wind \t 4.Basic \n Enter version of your choice : ");
        String version=scanner.nextLine();
        CharacterBuilder characterBuilder=new CharacterBuilder();
        CharacterType characterType1= characterBuilder.buildAhri();
        characterType1.showItems();
        CharacterBuilder characterBuilder1=new CharacterBuilder();
        Character character1;
        switch(choice) {
            case 1:
                   character1 = characterBuilder1.buildAhri1().setWeapon(weapon).setVersion(version);
                   break;
            case 2:
                   character1 = characterBuilder1.buildAkali1().setWeapon(weapon).setVersion(version);
                   break;
            case 3:
                   character1 = characterBuilder1.buildEvelynn1().setWeapon(weapon).setVersion(version);
                   break;
            default:
                   character1=characterBuilder1.buildAhri1();

        }
        character1.getVersion();
        character1.getWeapon();
    }
}
