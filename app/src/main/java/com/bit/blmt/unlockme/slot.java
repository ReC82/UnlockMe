package com.bit.blmt.unlockme;

import android.widget.ImageView;

/**
 * Created by blmt on 01/03/2018.
 */

public class slot {
    private ImageView img;
    private int max, value;
    private int posx, posy;
    private ImageView[] available_img;

    public slot(ImageView img, int max, int posx, int posy, ImageView[] available_img) {
        this.img = img;
        this.max = max;
        this.posx = posx;
        this.posy = posy;
        this.available_img = available_img;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public ImageView[] getAvailable_img() {
        return available_img;
    }

    public void setAvailable_img(ImageView[] available_img) {
        this.available_img = available_img;
    }
}
