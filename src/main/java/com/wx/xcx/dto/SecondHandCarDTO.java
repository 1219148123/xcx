package com.wx.xcx.dto;

import java.util.Objects;

public class SecondHandCarDTO {
    private Integer carId;

    private String carAge;

    private Integer carType;

    private String carKilometre;

    private String carPhone;

    private String carPeople;

    private String carImg;

    private Integer carStatus;

    private String carOriginalPrice;

    private String carNowPrice;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarAge() {
        return carAge;
    }

    public void setCarAge(String carAge) {
        this.carAge = carAge;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public String getCarKilometre() {
        return carKilometre;
    }

    public void setCarKilometre(String carKilometre) {
        this.carKilometre = carKilometre;
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone;
    }

    public String getCarPeople() {
        return carPeople;
    }

    public void setCarPeople(String carPeople) {
        this.carPeople = carPeople;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public String getCarOriginalPrice() {
        return carOriginalPrice;
    }

    public void setCarOriginalPrice(String carOriginalPrice) {
        this.carOriginalPrice = carOriginalPrice;
    }

    public String getCarNowPrice() {
        return carNowPrice;
    }

    public void setCarNowPrice(String carNowPrice) {
        this.carNowPrice = carNowPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecondHandCarDTO)) return false;
        SecondHandCarDTO that = (SecondHandCarDTO) o;
        return Objects.equals(getCarId(), that.getCarId()) &&
                Objects.equals(getCarAge(), that.getCarAge()) &&
                Objects.equals(getCarType(), that.getCarType()) &&
                Objects.equals(getCarKilometre(), that.getCarKilometre()) &&
                Objects.equals(getCarPhone(), that.getCarPhone()) &&
                Objects.equals(getCarPeople(), that.getCarPeople()) &&
                Objects.equals(getCarImg(), that.getCarImg()) &&
                Objects.equals(getCarStatus(), that.getCarStatus()) &&
                Objects.equals(getCarOriginalPrice(), that.getCarOriginalPrice()) &&
                Objects.equals(getCarNowPrice(), that.getCarNowPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarId(), getCarAge(), getCarType(), getCarKilometre(), getCarPhone(), getCarPeople(), getCarImg(), getCarStatus(), getCarOriginalPrice(), getCarNowPrice());
    }
}
