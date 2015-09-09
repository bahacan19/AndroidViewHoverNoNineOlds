package com.daimajia.androidviewhover.daijma;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by baha on 8/5/15.
 */
public class LikeBigAnimator extends  BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleX", 1, 1.5f, 1.0f),
                ObjectAnimator.ofFloat(target, "scaleY", 1, 1.5f, 1.0f));
    }
}
