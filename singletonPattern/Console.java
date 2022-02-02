package singletonPattern;

public class Console {
    private static final Console instance=new Console();
    public String game="nothing";
    private Console(){
        System.out.println("connected to Console");
    }
    public static synchronized Console getInstance(){
        return instance;
    }
    public void play(){
        System.out.println("joystick connected to console\n You can start playing");
    }
}
