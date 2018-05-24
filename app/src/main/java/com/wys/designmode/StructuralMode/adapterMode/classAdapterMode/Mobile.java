package com.wys.designmode.StructuralMode.adapterMode.classAdapterMode;

import android.util.Log;

/**
 * Created by yas on 2018/5/23.
 * Client类：手机，需要5V电压
 */

public class Mobile {
    private final String TAG="Mobile";
    public void charging(Voltage5 voltage5){
        if (voltage5.output5v()==5){
            Log.d(TAG,"[charging] 电压刚刚好5v，开始充电");
        }else if (voltage5.output5v()>5){
            Log.d(TAG,"[charging] 电压超过5v，都闪开 我要变成note7了");
        }
    }
}
