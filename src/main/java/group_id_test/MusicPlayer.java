package group_id_test;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

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

    //Инверсия котроля (зависимость устанавливается извне)
    /*public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void MusicPlayer(){};

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music music: musicList) {
            System.out.println("Now playing: " + music.getSong());
        }
    }
}
