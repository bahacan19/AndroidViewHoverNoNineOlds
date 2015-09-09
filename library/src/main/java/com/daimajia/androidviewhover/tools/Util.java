package com.daimajia.androidviewhover.tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;



public class Util {

    public static Bitmap getViewBitmap(View v) {
        if(v.getWidth() == 0 || v.getHeight() == 0)
            return null;
        Bitmap b = Bitmap.createBitmap( v.getWidth(), v.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.draw(c);
        return b;
    }

    public static void reset(View target) {
        target.setAlpha(1);
        target.setScaleX(1);
        target.setScaleY(1);
        target.setTranslationX(1);
        target.setTranslationY(1);
        target.setRotation(1);
        target.setRotationY(1);
        target.setRotationX(1);
        target.setPivotX(target.getMeasuredWidth() / 2.0f);
        target.setPivotY(target.getMeasuredWidth() / 2.0f);
    }

}
