package cn.amos.common.dto;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * PROJECT: boot-single
 *
 * @author DaoYuanWang
 * @date 2018/1/18
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaoBaoLocationDTO implements Serializable {
    private static final long serialVersionUID = -3582171569909582185L;
    /**
     * 国家
     */
    private String country;
    @JsonProperty("country_id")
    private String countryId;
    /**
     * 地区
     */
    private String area;
    @JsonProperty("area_id")
    private String areaId;
    /**
     * 省份
     */
    private String region;
    @JsonProperty("region_id")
    private String regionId;
    /**
     * 城市
     */
    private String city;
    @JsonProperty("city_id")
    private String cityId;
    /**
     * 假的·省份·NULL
     */
    private String county;
    @JsonProperty("county_id")
    private String countyId;
    /**
     * 运营商
     */
    private String isp;
    @JsonProperty("isp_id")
    private String ispId;
    /**
     * ip地址
     */
    private String ip;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getIspId() {
        return ispId;
    }

    public void setIspId(String ispId) {
        this.ispId = ispId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}



