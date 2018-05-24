package com.wys.designmode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wys.designmode.StructuralMode.adapterMode.classAdapterMode.Mobile;
import com.wys.designmode.StructuralMode.adapterMode.classAdapterMode.Voltage220;
import com.wys.designmode.StructuralMode.adapterMode.objAdapterMode.VoltageAdapter2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Mobile mobile=new Mobile();
//        mobile.charging(new VoltageAdapter());

        VoltageAdapter2 adapter2=new VoltageAdapter2(new Voltage220());
        Mobile mobile=new Mobile();
        mobile.charging(adapter2);

        ValueAnimator valueAnimator=ValueAnimator.ofInt(1,100);
        valueAnimator.setDuration(3000);
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
