/**
 * A yummy toast
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

public class Toast extends PowerUp {
    
    /**
     * Static bitmap to reduce memory usage.
     */
    public static Bitmap globalBitmap;
    
    public static final int POINTS_TO_TOAST = 42;

    public Toast(GameView view, Game game) {
        super(view, game);
        if(globalBitmap == null){
            globalBitmap = Util.getScaledBitmapAlpha8(game, R.drawable.toast);
        }
        this.bitmap = globalBitmap;
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
    }

    /**
     * When eaten the player will turn into nyan cat.
     */
    @Override
    public void onCollision() {
        super.onCollision();
        view.changeToNyanCat();
    }
    
    
}
