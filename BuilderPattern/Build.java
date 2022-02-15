package BuilderPattern;

public interface Build {
    public Character setWeapon(String weapon);
    public String getWeapon();
    public int getScore();
    public String getVersion();
    public Character setVersion(String version);
}
