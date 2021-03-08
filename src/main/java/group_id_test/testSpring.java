package group_id_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );





//        ClassicalMusic classicalMusic = context.getBean("classic_musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicBean", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicBean", MusicPlayer.class);
//
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//
//        MusicPlayer musicPlayerList = context.getBean("musicListBean", MusicPlayer.class);
//        musicPlayerList.playMusicList();


        context.close();
    }
}
