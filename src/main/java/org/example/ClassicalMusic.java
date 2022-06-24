package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}// Приватный конструктор, говороит о том, что объекты этого класса нужно создавать с помищью фабричного метода
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Do my destruction");
    }
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
