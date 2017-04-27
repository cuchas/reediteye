package com.example.eduardocucharro.reediteye.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class Comment implements Parcelable {

    private String id;
    private String text;
    private String author;
    private String score;
    private Date date;

    public Comment(String author, String id, String text, Date date) {
        this.author = author;
        this.id  = id;
        this.text = text;
        this.date = date;
    }

    protected Comment(Parcel in) {
        id = in.readString();
        text = in.readString();
        author = in.readString();
        score = in.readString();
        date = (Date)in.readSerializable();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(text);
        dest.writeString(author);
        dest.writeString(score);
        dest.writeSerializable(date);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Comment> CREATOR = new Creator<Comment>() {
        @Override
        public Comment createFromParcel(Parcel in) {
            return new Comment(in);
        }

        @Override
        public Comment[] newArray(int size) {
            return new Comment[size];
        }
    };

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getScore() {
        return score;
    }

    public String getText() {
        return text;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
