package com.alpha.jxust.model;

import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVStatus;

import kale.adapter.AdapterModel;

/**
 * @author SongJian
 * @created 2016/3/3.
 * @e-mail 1129574214@qq.com
 */
public class Status implements AdapterModel {
    private AVStatus innerStatus;
    private AVObject detail;

    public AVStatus getInnerStatus() {
        return innerStatus;
    }

    public void setInnerStatus(AVStatus innerStatus) {
        this.innerStatus = innerStatus;
    }

    public AVObject getDetail() {
        return detail;
    }

    public void setDetail(AVObject detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Status{" +
                "innerStatus=" + innerStatus +
                ", detail=" + detail +
                '}';
    }

    @Override
    public int getDataTypeCount() {
        return 0;
    }

    @Override
    public Object getDataType() {
        return null;
    }
}
