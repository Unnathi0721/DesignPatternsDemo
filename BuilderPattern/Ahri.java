package BuilderPattern;

public class Ahri extends Character{
    Ahri(){
        super.name="Ahri";
    }
    @Override
    public Character setWeapon(String weapon){
        super.weapon=weapon;
        System.out.println("Ahri's new Weapon :"+weapon);
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
