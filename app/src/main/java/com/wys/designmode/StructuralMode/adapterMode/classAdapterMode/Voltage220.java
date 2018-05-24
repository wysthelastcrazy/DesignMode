package com.wys.designmode.StructuralMode.adapterMode.classAdapterMode;

import android.util.Log;

/**
 * Created by yas on 2018/5/23.
 * src类：我们有的（220v电压）
 */

public class Voltage220 {
    private final String TAG="Voltage220";
    public int output220v(){
        int src=220;
        Log.d(TAG,"[output220v] 我是"+src+"v");
        return src;
    }
}
