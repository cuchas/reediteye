package com.example.eduardocucharro.reediteye.feed;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eduardocucharro.reediteye.R;
import com.example.eduardocucharro.reediteye.data.Post;
import com.example.eduardocucharro.reediteye.util.DateUtils;
import com.squareup.picasso.Picasso;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class PostViewHolder extends RecyclerView.ViewHolder {

    private final ViewHolderListener listener;
    private View.OnClickListener postClickListener;

    interface ViewHolderListener {
        void onPostClick(Post post);
        void onCommentsClick(Post post);
        void onShareClick(Post post);
    }

    @BindView(R.id.text_time_post)
    TextView textTime;

    @BindView(R.id.text_title_post)
    TextView textTitle;

    @BindView(R.id.image_post)
    ImageView imagePost;

    @BindView(R.id.text_comments_number_post)
    TextView textCommentsNumber;

    @BindView(R.id.text_score_post)
    TextView textScore;

    @BindView(R.id.card_post)
    CardView cardView;

    @BindView(R.id.text_browse_post)
    TextView textShare;

    public PostViewHolder(View itemView, final ViewHolderListener listener) {
        super(itemView);

        this.listener = listener;

        ButterKnife.bind(this, itemView);
    }

    public void bind(final Post post) {

        postClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) listener.onPostClick(post);
            }
        };

        setupShare(post);

        setupDate(post);

        setupTitle(post);

        setupComments(post);

        textScore.setText(String.format("%d", post.getScore()));

        setupImage(post);
    }

    private void setupTitle(Post post) {
        textTitle.setText(post.getTitle());
        textTitle.setOnClickListener(postClickListener);
    }

    private void setupShare(final Post post) {
        textShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) listener.onShareClick(post);
            }
        });
    }

    private void setupImage(Post post) {

        Context context = imagePost.getContext();

        int densityDpi = context.getResources().getDisplayMetrics().densityDpi;

        String imageUrl = post.getImageUrl(densityDpi);

        if(imageUrl == null || imageUrl.isEmpty())
            imagePost.setVisibility(View.GONE);
        else
            imagePost.setVisibility(View.VISIBLE);

        imagePost.setOnClickListener(postClickListener);

        Picasso.with(context)
                .load(imageUrl)
                .into(imagePost);
    }

    private void setupComments(final Post post) {
        Context context = textCommentsNumber.getContext();
        String f = context.getString(R.string.comments_format);
        textCommentsNumber.setText(String.format(f, post.getComments()));
        textCommentsNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) listener.onCommentsClick(post);
            }
        });
    }

    private void setupDate(Post post) {

        Date now = Calendar.getInstance().getTime();

        long daysPassed = DateUtils.calculateDaysPassed(now, post.getDate());

        Context context = textTime.getContext();

        if(daysPassed >= 1) {
            String format = String.format(context.getString(R.string.days_passed_format), String.valueOf(daysPassed));
            textTime.setText(format);
        } else {

            long hoursPassed = DateUtils.calculateHoursPassed(now, post.getDate());

            if(hoursPassed >= 1) {
                String format = String.format(context.getString(R.string.hours_passed_format), String.valueOf(hoursPassed));
                textTime.setText(format);

            } else {
                long minutesPassed = DateUtils.calculateMinutesPassed(now, post.getDate());
                String format = String.format(context.getString(R.string.minutes_passed_format), String.valueOf(minutesPassed));
                textTime.setText(format);
            }
        }
    }
}
