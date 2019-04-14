package gilles.maillot.spacegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView  = new GameView(this);
        //setContentView(R.layout.activity_game);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        Constant.SCREEN_WIDTH = metrics.widthPixels;
        Constant.SCREEN_HEIGHT = metrics.heightPixels;

        int  largeur = Constant.SCREEN_WIDTH;
        System.out.println(metrics.heightPixels);
        System.out.println(metrics.widthPixels);
        setContentView(gameView);

/*
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager);
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int deviceWidth = displayMetrics.widthPixels;
        int deviceHeight = displayMetrics.heightPixels;
*/

    }
}
