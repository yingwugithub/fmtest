package fmtest;

import java.io.Serializable;

/**
 * Created by dfn on 15/9/25.
 */
public class AdminRadioChannel implements Serializable{
    private Long id;//标识
    private Long radioId;//location表主键
    private Long cityId;//城市主键ID
    private String name;// 电台名称
    private String radioName;// 频道名称
    private String locationName;//省份名称
    private String hz;//频率

    private Long updateTime;//修改时间
    private Long createTime;//创建时间
    private int status;//状态

    public Long getUpdateTime() {
        return updateTime;
    }



    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRadioId() {
        return radioId;
    }

    public void setRadioId(Long radioId) {
        this.radioId = radioId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getHz() {
        return hz;
    }

    public void setHz(String hz) {
        this.hz = hz;
    }


}
