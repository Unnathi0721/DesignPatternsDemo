package BuilderPattern;

public class CharacterBuilder {
    public CharacterType buildAhri(){
        CharacterType cType=new CharacterType();
        cType.addItem(new Ahri());
        return cType;
    }
    public CharacterType buildAkali(){
        CharacterType cType=new CharacterType();
        cType.addItem(new Akali());
        return cType;
    }
    public CharacterType buildEvelynn(){
        CharacterType cType=new CharacterType();
        cType.addItem(new Evelynn());
        return cType;
    }
    public Character buildAhri1(){
        Character character=new Ahri();
        return character;
    }
    public Character buildAkali1(){
        Character character=new Akali();
        return character;
    }
    public Character buildEvelynn1(){
        Character character=new Evelynn();
        return character;
    }
}
