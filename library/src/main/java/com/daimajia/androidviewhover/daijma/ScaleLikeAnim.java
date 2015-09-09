package com.daimajia.androidviewhover.daijma;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by baha on 8/3/15.
 */
public class ScaleLikeAnim extends  BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleX", 1, 0.9f, 0.8f, 0.7f, 0.8f, 0.9f, 1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.5f, 1.4f, 1.3f, 1.2f, 1.0f),
                ObjectAnimator.ofFloat(target, "scaleY", 1, 0.9f, 0.8f, 0.7f, 0.8f, 0.9f, 1.0f, 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.5f, 1.4f, 1.3f, 1.2f, 1.0f));
    }
}
