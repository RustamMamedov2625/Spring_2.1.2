package model;

public class Cat {
    private String sound;

    public Cat() {
        this.sound = "Meow";
    }

    public String getSound() {
        return sound;
    }

    public void meow(){
        System.out.println("meow");
    }
}
