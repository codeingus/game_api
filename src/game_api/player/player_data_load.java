package game_api.player;

import game_api.game_settings.game_erorr;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static game_api.player.player_data.player_name;

public class player_data_load {

    public static void player_data_load() {

        Properties pro= new Properties();
        try {
            pro.load(new FileInputStream("src/game_api/resources/player_data.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
            game_erorr.game_erorr();
        }

        player_name = pro.getProperty("player_name");


    }

}
