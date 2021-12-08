package com.android45.truongtrungkien_buoi6_adr45.model;

public class Recommended {
    int imgFoodRecommended;
    int imgFavoriteRecommended;
    String tvNameFoodRecommended;
    float rbStarRecommended;
    String tvMoneyRecommended;

    public Recommended(int imgFoodRecommended, int imgFavoriteRecommended, String tvNameFoodRecommended, float rbStarRecommended, String tvMoneyRecommended) {
        this.imgFoodRecommended = imgFoodRecommended;
        this.imgFavoriteRecommended = imgFavoriteRecommended;
        this.tvNameFoodRecommended = tvNameFoodRecommended;
        this.rbStarRecommended = rbStarRecommended;
        this.tvMoneyRecommended = tvMoneyRecommended;
    }

    public int getImgFoodRecommended() {
        return imgFoodRecommended;
    }

    public void setImgFoodRecommended(int imgFoodRecommended) {
        this.imgFoodRecommended = imgFoodRecommended;
    }

    public int getImgFavoriteRecommended() {
        return imgFavoriteRecommended;
    }

    public void setImgFavoriteRecommended(int imgFavoriteRecommended) {
        this.imgFavoriteRecommended = imgFavoriteRecommended;
    }

    public String getTvNameFoodRecommended() {
        return tvNameFoodRecommended;
    }

    public void setTvNameFoodRecommended(String tvNameFoodRecommended) {
        this.tvNameFoodRecommended = tvNameFoodRecommended;
    }

    public float getRbStarRecommended() {
        return rbStarRecommended;
    }

    public void setRbStarRecommended(float rbStarRecommended) {
        this.rbStarRecommended = rbStarRecommended;
    }

    public String getTvMoneyRecommended() {
        return tvMoneyRecommended;
    }

    public void setTvMoneyRecommended(String tvMoneyRecommended) {
        this.tvMoneyRecommended = tvMoneyRecommended;
    }
}
