package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();// зависимость интерфейса Music
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public MusicPlayer(){}
    public void playMusicList(){
        for(Music x : musicList)
        System.out.println("Playing: " + x.getSong());
    }
}
