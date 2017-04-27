package com.example.eduardocucharro.reediteye.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class Post implements Parcelable {
    private String id;
    private String title;
    private String url;
    private String imageUrl;
    private Date date;
    private int comments;
    private String name;
    private int score;
    private List<ImageSpec> imageSpecList = new ArrayList<>();
    private String cacheUrl;

    public Post(String id, String title, Date date) {
        this.title = title;
        this.date = date;
        this.id = id;
    }

    public Post() {
    }

    protected Post(Parcel in) {
        id = in.readString();
        title = in.readString();
        url = in.readString();
        imageUrl = in.readString();
        cacheUrl = in.readString();
        comments = in.readInt();
        name = in.readString();
        score = in.readInt();
        imageSpecList = in.createTypedArrayList(ImageSpec.CREATOR);
        date = (Date)in.readSerializable();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(imageUrl);
        dest.writeString(cacheUrl);
        dest.writeInt(comments);
        dest.writeString(name);
        dest.writeInt(score);
        dest.writeTypedList(imageSpecList);
        dest.writeSerializable(date);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public int getComments() {
        return comments;
    }

    public String getUrl() {
        return url;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl(int density) {

        if(cacheUrl != null && !cacheUrl.isEmpty()) return cacheUrl;

        if(imageSpecList.isEmpty()) return imageUrl;

        for (ImageSpec spec : imageSpecList) {

            if(density < 320 && spec.getW() >= 600) {

                cacheUrl = spec.getUrl().replace("&amp;", "&");
                return cacheUrl;
            } else if(spec.getW() > 1000) {
                cacheUrl = spec.getUrl().replace("&amp;", "&");
                return cacheUrl;
            }
        }

        return imageUrl;
    }

    public void setImageSpecList(List<ImageSpec> imageSpecList) {
        this.imageSpecList = imageSpecList;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
