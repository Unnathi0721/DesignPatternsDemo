package BuilderPattern;

public abstract class Character implements Build{
    String weapon="no Weapon";
    String version="basic";
    String name;
    int points=50;
    public abstract Character setWeapon(String weapon);
    public abstract String getWeapon();
    public abstract int getScore();
    public abstract String getVersion();
    public abstract Character setVersion(String version);
}
