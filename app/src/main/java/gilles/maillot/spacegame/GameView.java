package gilles.maillot.spacegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import gilles.maillot.spacegame.R;

public class GameView extends View {

    private Bitmap  spaceShip;

    public GameView(Context context) {
        super(context);

        spaceShip = BitmapFactory.decodeResource(getResources(), R.drawable.spacecraft_00);
        spaceShip = Bitmap.createScaledBitmap(spaceShip, 150,150,false);

    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawBitmap(spaceShip, 467, 1580,null);

    }



}


/*
    public Bitmap getResizedBitmap(Bitmap bm, int newWidth, int newHeight) {
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;

        // CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        // RESIZE THE BIT MAP
        matrix.postScale(scaleWidth, scaleHeight);

        // "RECREATE" THE NEW BITMAP

        Bitmap resizedBitmap = Bitmap.createBitmap(
                bm, 0, 0, width, height, matrix, false);
        bm.recycle();
        return resizedBitmap;
    }
*/
