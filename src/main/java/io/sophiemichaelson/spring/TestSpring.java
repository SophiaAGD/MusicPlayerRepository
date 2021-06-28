package io.sophiemichaelson.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        NCTDreamMusic nctDreamMusic = context.getBean("musicBean0", NCTDreamMusic.class);
        NCT127Music nct127Music = context.getBean("musicBean1", NCT127Music.class);
        WayVMusic wayVMusic = context.getBean("musicBean2", WayVMusic.class);

        int res = musicPlayer.userInputReader(musicPlayer);
        if(res == 1){
            nctDreamMusic.playSong();
            System.out.println("Enjoy your music!");
        }else if(res == 2){
            nct127Music.playSong();
            System.out.println("Enjoy your music!");
        }else if(res == 3){
            wayVMusic.playSong();
            System.out.println("Enjoy your music!");
        }


        context.close();





    }
}
