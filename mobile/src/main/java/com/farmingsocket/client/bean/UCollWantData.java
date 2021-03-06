package com.farmingsocket.client.bean;

/**
 * Created by Administrator on 2017/7/5 0005.
 */

public class UCollWantData {
    private float  reviceTime;
    private float  value;
    private int    type;
    private int    order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;

    }

    public float getReviceTime() {
        return reviceTime;
    }

    public void setReviceTime(float reviceTime) {
        this.reviceTime = reviceTime;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UCollWantData{" +
                "reviceTime=" + reviceTime +
                ", value=" + value +
                '}';
    }

    public UCollWantData(float reviceTime, float value) {
        this.reviceTime = reviceTime;
        this.value = value;
    }
}