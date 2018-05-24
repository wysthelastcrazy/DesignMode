package com.wys.designmode.StructuralMode.adapterMode.classAdapterMode;

import android.util.Log;

/**
 * Created by yas on 2018/5/23.
 * Adapter类，实现dst类接口，完成src->dst的适配
 */

public class VoltageAdapter extends Voltage220 implements Voltage5{
    private final String TAG="VoltageAdapter";
    @Override
    public int output5v() {
        int src=output220v();
        Log.d(TAG,"[output5v]  适配器工作开始适配电压");
        int dst=src/44;
        Log.d(TAG,"[output5v]  适配完成后输出电压："+dst);
        return dst;
    }
}
