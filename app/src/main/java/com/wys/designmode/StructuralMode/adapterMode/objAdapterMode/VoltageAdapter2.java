package com.wys.designmode.StructuralMode.adapterMode.objAdapterMode;

import android.util.Log;

import com.wys.designmode.StructuralMode.adapterMode.classAdapterMode.Voltage220;
import com.wys.designmode.StructuralMode.adapterMode.classAdapterMode.Voltage5;

/**
 * Created by yas on 2018/5/23.
 * 介绍：对象适配器模式
 * 持有src类，实现dst类接口
 */

public class VoltageAdapter2 implements Voltage5{
    private final String TAG="VoltageAdapter2";
    private Voltage220 mVoltage220;
    public VoltageAdapter2(Voltage220 voltage220){
        mVoltage220=voltage220;
    }
    @Override
    public int output5v() {
        int dst=0;
        if (null!=mVoltage220){
            int src=mVoltage220.output220v();
            Log.d(TAG,"对象适配器工作，开始适配电压");
            dst=src/44;
            Log.d(TAG,"适配完成后输出电压："+dst);
        }
        return dst;
    }
}
