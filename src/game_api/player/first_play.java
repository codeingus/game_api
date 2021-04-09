package game_api.player;


import game_api.game_settings.game_erorr;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static game_api.player.player_data.player_name;

public class first_play {

    public static void first_play() {

        Properties pro= new Properties();

        try {
            pro.load(new FileInputStream("src/game_api/resources/player_data.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
            game_erorr.game_erorr();
        }

         player_name = JOptionPane.showInputDialog("사용할 닉네임를 입력하세요");

         pro.setProperty("player_name", player_name);
        try {
            pro.save( new FileOutputStream("src/game_api/resources/player_data.properties"),"this is comment!!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
            game_erorr.game_erorr();
        }
        System.out.println(player_name);
    }

}
