package com.zcy.ghost.vivideo.model.bean;

import java.io.Serializable;

import io.realm.RealmObject;

/**
 * Description: 播放记录
 * Creator: yxc
 * date: 2016/9/23 11:30
 */
public class Record extends RealmObject implements Serializable {
    public String title;
    public String pic;
    public String dataId;
    String id;
    long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}