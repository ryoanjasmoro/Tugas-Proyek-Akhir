/**
 * The pauseButton
 * 
 * @author Ryo
 * Copyright (c) <2017> <Ryo>
 */

package com.Yful.appayipyip.sprites;

import com.Yful.appayipyip.Game;
import com.Yful.appayipyip.GameView;
import com.Yful.appayipyip.R;
import com.Yful.appayipyip.Util;

public class PauseButton extends Sprite{
    public PauseButton(GameView view, Game game) {
        super(view, game);
        this.bitmap = Util.getScaledBitmapAlpha8(game, R.drawable.pause_button);
        this.width = this.bitmap.getWidth();
        this.height = this.bitmap.getHeight();
    }
    
    /**
     * Sets the button in the right upper corner.
     */
    @Override
    public void move(){
        this.x = this.view.getWidth() - this.width;
        this.y = 0;
    }
}