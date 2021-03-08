package group_id_test;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;

    private String name;
    private int volume;

    private void doMyInit(){
        System.out.println("Initialization is done!");
    }
    private void doMyDestroy(){
        System.out.println("Destroy is done!");
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

    //Инверсия котроля (зависимость устанавливается извне)
    /*public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void MusicPlayer(){};

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }

    public void playMusicList(){
        for (Music music: musicList) {
            System.out.println("Now playing: " + music.getSong());
        }
    }
}
