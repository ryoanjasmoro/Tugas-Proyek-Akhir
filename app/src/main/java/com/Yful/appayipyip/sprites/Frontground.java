/**
 * Manages the bitmap at the front
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

public class Frontground extends Background {
    /**
     * Height of the ground relative to the height of the bitmap
     */
    public static final float GROUND_HEIGHT = (1f * /*45*/ 35) / 720;

    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;
    
    public Frontground(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getDownScaledBitmapAlpha8(game, R.drawable.fg);
        }
        this.bitmap = globalBitmap;
    }
    
}
