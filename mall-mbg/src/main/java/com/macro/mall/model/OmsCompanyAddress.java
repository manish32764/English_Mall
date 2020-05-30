package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class OmsCompanyAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    @ApiModelProperty(value = "address name")
    private String addressName;
    @ApiModelProperty(value = "Default Ship From Address: 0-> No; 1-> Yes")
    private Integer sendStatus;
    @ApiModelProperty(value = "Whether the default ship-to address: 0-> No; 1-> Yes")
    private Integer receiveStatus;
    @ApiModelProperty(value = "consignee name")
    private String name;
    @ApiModelProperty(value = "consignee phone")
    private String phone;
    @ApiModelProperty(value = "Province/Municipality")
    private String province;
    @ApiModelProperty(value = "city")
    private String city;
    @ApiModelProperty(value = "zone")
    private String region;
    @ApiModelProperty(value = "detailed address")
    private String detailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
