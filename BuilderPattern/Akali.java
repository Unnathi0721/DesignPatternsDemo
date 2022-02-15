package BuilderPattern;

public class Akali extends Character{
    Akali(){
        super.name="Akali";
    }
    @Override
    public Character setWeapon(String weapon){
        super.weapon=weapon;
        System.out.println("Akali's new Weapon :"+weapon);
        return this;
    }
    @Override
    public String getWeapon(){
        return super.weapon;
    }
    @Override
    public int getScore(){
        return points;
    }
    @Override
    public String getVersion(){
        return super.version;
    }
    @Override
    public Character setVersion(String version){
        super.version=version;
        return this;
    }
}
