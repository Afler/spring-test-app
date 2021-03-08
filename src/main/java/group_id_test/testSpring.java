package group_id_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );

        Music music1 = context.getBean("classicalMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();



        context.close();
    }
}
