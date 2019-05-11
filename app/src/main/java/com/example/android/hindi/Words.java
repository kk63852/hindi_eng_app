package com.example.android.hindi;


public class Words {
    private String mDefaultTranslation;
    private String mHindiTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Words(String defaultTranslation, String hindiTranslation) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
    }
    public Words(String defaultTranslation, String hindiTranslation,int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
        mImageResourceId=ImageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getHindiTranslation() {
        return mHindiTranslation;
    }
    public int getImageResourceId(){return mImageResourceId;}
    public boolean hasImage(){return mImageResourceId!=NO_IMAGE_PROVIDED;}
}
