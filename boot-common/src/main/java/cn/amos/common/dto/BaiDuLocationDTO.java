package cn.amos.common.dto;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
public class BaiDuLocationDTO implements Serializable {
    private static final long serialVersionUID = 1115816313136321458L;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}