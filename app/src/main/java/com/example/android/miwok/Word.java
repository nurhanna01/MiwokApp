package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranlstion;

    //mengatur variabel gambar agra dimulai dari satus tanpa gambar secara default
    private int mImageResourceId = NO_LMAGE_PROVIDED;

    //??????
    //membuat konstanta yang merepresentasikan state tanpa gambar
    //digunakan -1 karena di luar kisaran dari semua resourceId yg valid
    private static final int NO_LMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    //constructor 1 /? create new word object
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranlstion = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //constructor 2
    public Word(String defaultTranslation,String miwokTranslation,int imageResouceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranlstion = miwokTranslation;
        mImageResourceId=imageResouceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranlstion;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_LMAGE_PROVIDED;
    }

    public int getAudioResourceId(){

        return mAudioResourceId;
    }
}
