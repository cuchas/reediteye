package com.example.eduardocucharro.reediteye.details;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.eduardocucharro.reediteye.R;
import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.util.DateUtils;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class CommentViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_author_details)
    TextView textAuthor;

    @BindView(R.id.text_points)
    TextView textPoints;

    @BindView(R.id.text_date_comment)
    TextView textDate;

    @BindView(R.id.text_comment)
    TextView textComment;

    public CommentViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void bind(Comment comment) {
        textAuthor.setText(comment.getAuthor());
        textPoints.setText(comment.getScore());
        textComment.setText(Html.fromHtml(comment.getText()));

        setDate(comment);
    }

    private void setDate(Comment comment) {

        Date now = Calendar.getInstance().getTime();

        long daysPassed = DateUtils.calculateDaysPassed(now, comment.getDate());

        Context context = textDate.getContext();

        if(daysPassed >= 1) {
            String format = String.format(context.getString(R.string.days_passed_format), String.valueOf(daysPassed));
            textDate.setText(format);
        } else {

            long hoursPassed = DateUtils.calculateHoursPassed(now, comment.getDate());

            if(hoursPassed >= 1) {
                String format = String.format(context.getString(R.string.hours_passed_format), String.valueOf(hoursPassed));
                textDate.setText(format);

            } else {
                long minutesPassed = DateUtils.calculateMinutesPassed(now, comment.getDate());
                String format = String.format(context.getString(R.string.minutes_passed_format), String.valueOf(minutesPassed));
                textDate.setText(format);
            }
        }
    }
}
