/**
 * A shopped wodden log
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

public class WoodLog extends Sprite {

    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;

    public WoodLog(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.fire_full);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
    }
    
    /**
     * Sets the position
     * @param x
     * @param y
     */
    public void init(int x, int y){
        this.x = x;
        this.y = y;
    }
}
