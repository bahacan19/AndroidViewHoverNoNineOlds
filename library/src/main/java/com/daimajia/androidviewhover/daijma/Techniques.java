package com.daimajia.androidviewhover.daijma;

/**
 * Created by baha on 10/07/15.
 */
public enum Techniques {
    Tada(TadaAnimator.class),
    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    Swing(SwingAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),
    BounceIn(BounceInAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),

    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class);

    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
