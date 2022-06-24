package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  // Класс обращается к applicationContext.xml расположенном в resources, считывает его и помещает все бины которые там описаны в ApplicationContext
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);// Получаем бин getBean() из context, в параметр передаем id из xml и класс бин(объект) которого хотим получить. Присваиваем это все переменной music
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusicList();
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());
        context.close(); // Обязательно нужно закрыть applicationContext
    }
}
