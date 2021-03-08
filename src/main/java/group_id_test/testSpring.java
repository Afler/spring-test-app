package group_id_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicListBean", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();

    }
}