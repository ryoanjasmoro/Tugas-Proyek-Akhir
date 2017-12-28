/**
 * Rainbow tail for the nyan cat
 * 
 * @author Ryo
 * Copyright (c) <2017> <Ryo>
 */

package com.Yful.appayipyip.sprites;

import com.Yful.appayipyip.Game;
import com.Yful.appayipyip.GameView;
import com.Yful.appayipyip.R;
import com.Yful.appayipyip.Util;

import android.graphics.Bitmap;

public class Rainbow extends Sprite {
    
    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;
    
    public Rainbow(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.rainbow);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth()/(colNr = 4);
        this.height = this.bitmap.getHeight()/3;
    }

    @Override
    public void move() {
        changeToNextFrame();
        super.move();
    }
    
    
}
