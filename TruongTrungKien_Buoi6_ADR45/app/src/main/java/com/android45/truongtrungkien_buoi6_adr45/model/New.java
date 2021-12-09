package com.android45.truongtrungkien_buoi6_adr45.model;

import android.os.Parcel;
import android.os.Parcelable;

public class New implements Parcelable {
    int imgFoodNew;
    int imgFavoriteNew;
    String tvNameFoodNew;
    float rbStarNew;
    String tvMoneyNew;

    public New(int imgFoodNew, int imgFavoriteNew, String tvNameFoodNew, float rbStarNew, String tvMoneyNew) {
        this.imgFoodNew = imgFoodNew;
        this.imgFavoriteNew = imgFavoriteNew;
        this.tvNameFoodNew = tvNameFoodNew;
        this.rbStarNew = rbStarNew;
        this.tvMoneyNew = tvMoneyNew;
    }

    protected New(Parcel in) {
        imgFoodNew = in.readInt();
        imgFavoriteNew = in.readInt();
        tvNameFoodNew = in.readString();
        rbStarNew = in.readFloat();
        tvMoneyNew = in.readString();
    }

    public static final Creator<New> CREATOR = new Creator<New>() {
        @Override
        public New createFromParcel(Parcel in) {
            return new New(in);
        }

        @Override
        public New[] newArray(int size) {
            return new New[size];
        }
    };

    public int getImgFoodNew() {
        return imgFoodNew;
    }

    public void setImgFoodNew(int imgFoodNew) {
        this.imgFoodNew = imgFoodNew;
    }

    public int getImgFavoriteNew() {
        return imgFavoriteNew;
    }

    public void setImgFavoriteNew(int imgFavoriteNew) {
        this.imgFavoriteNew = imgFavoriteNew;
    }

    public String getTvNameFoodNew() {
        return tvNameFoodNew;
    }

    public void setTvNameFoodNew(String tvNameFoodNew) {
        this.tvNameFoodNew = tvNameFoodNew;
    }

    public float getRbStarNew() {
        return rbStarNew;
    }

    public void setRbStarNew(float rbStarNew) {
        this.rbStarNew = rbStarNew;
    }

    public String getTvMoneyNew() {
        return tvMoneyNew;
    }

    public void setTvMoneyNew(String tvMoneyNew) {
        this.tvMoneyNew = tvMoneyNew;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imgFoodNew);
        dest.writeInt(imgFavoriteNew);
        dest.writeString(tvNameFoodNew);
        dest.writeFloat(rbStarNew);
        dest.writeString(tvMoneyNew);
    }
}
