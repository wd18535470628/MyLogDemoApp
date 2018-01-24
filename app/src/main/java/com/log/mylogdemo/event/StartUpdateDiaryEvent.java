package com.log.mylogdemo.event;

/**
 * Created by Administrator on 2018/1/24 0024.
 */

public class StartUpdateDiaryEvent {

    private int position;

    public StartUpdateDiaryEvent(int position) {
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
