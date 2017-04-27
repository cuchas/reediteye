package com.example.eduardocucharro.reediteye.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by eduardocucharro on 28/04/17.
 */

public class ImageSpec implements Parcelable {
    int w;
    int h;
    String url;

    public ImageSpec(String url, int w, int h) {
        this.url = url;
        this.w = w;
        this.h = h;
    }

    protected ImageSpec(Parcel in) {
        w = in.readInt();
        h = in.readInt();
        url = in.readString();
    }

    public static final Creator<ImageSpec> CREATOR = new Creator<ImageSpec>() {
        @Override
        public ImageSpec createFromParcel(Parcel in) {
            return new ImageSpec(in);
        }

        @Override
        public ImageSpec[] newArray(int size) {
            return new ImageSpec[size];
        }
    };

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(w);
        dest.writeInt(h);
        dest.writeString(url);
    }
}
