package com.example.student_portal;

import android.os.Parcel;
import android.os.Parcelable;

public class Portal implements Parcelable {

    private String nameTitle;
    private String nameURL;

    public Portal(String nameTitle, String nameURL) {
        this.nameTitle = nameTitle;
        this.nameURL = nameURL;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getNameURL() {
        return nameURL;
    }

    public void setNameURL(String nameURL) {
        this.nameURL = nameURL;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nameTitle);
        dest.writeString(this.nameURL);
    }

    protected Portal(Parcel in) {
        this.nameTitle = in.readString();
        this.nameURL = in.readString();
    }

    public static final Creator<Portal> CREATOR = new Creator<Portal>() {
        @Override
        public Portal createFromParcel(Parcel source) {
            return new Portal(source);
        }

        @Override
        public Portal[] newArray(int size) {
            return new Portal[size];
        }
    };
}
