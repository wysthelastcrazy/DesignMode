package com.wys.designmode.StructuralMode.adapterMode.interfaceAdapterMode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/**
 * Created by yas on 2018/5/23.
 */

public class Demo {
    /**
     * AnimatorListenerAdapter是Animator.AnimatorListener的空实现
     */
    public void interAdapterSrc(){
        ValueAnimator valueAnimator=ValueAnimator.ofInt(1,100);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }
        });
        valueAnimator.start();
//        valueAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//        valueAnimator.start();

    }
}
