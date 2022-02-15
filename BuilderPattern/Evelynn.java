package BuilderPattern;

public class Evelynn extends Character{
    Evelynn(){
        super.name="Evelynn";
    }
    @Override
    public Character setWeapon(String weapon){
        super.weapon=weapon;
        System.out.println("Evelynn's new Weapon :"+weapon);
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
