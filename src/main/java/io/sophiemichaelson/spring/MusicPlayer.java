package io.sophiemichaelson.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer { //Inversion of Control
    private Music music;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

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

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void setMusic(Music music){ //"music" parameter in <property>
        this.music = music;
    }
    public void setList(List<Music> musicList){
        this.musicList = musicList;
    }
    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public int userInputReader(MusicPlayer musicPlayer){
        System.out.println("Greetings! I'm your assistant - Sophie.");
        System.out.println("Which song do you want me to play? Choose one:");
        System.out.println("1. NCT DREAM 'Hello Future'");
        System.out.println("2. NCT 127 'Kick It'");
        System.out.println("3. WayV 'Love Talk'");
        Scanner scan = new Scanner(System.in);
        int input = 0;
        input = scan.nextInt();
        if(input == 1){
            System.out.println("Playing: NCT DREAM 'Hello Future'");
            return 1;
        }else if(input == 2){
            System.out.println("Playing: NCT 127 'Kick It'");
            return 2;
        }else if(input == 3){
            System.out.println("Playing: WayV 'Love Talk'");
            return 3;
        }
        return 0;

    }






}
