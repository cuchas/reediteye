package com.example.eduardocucharro.reediteye.details;

import android.content.Context;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduardocucharro.reediteye.feed.PostViewHolder;
import com.example.eduardocucharro.reediteye.R;
import com.example.eduardocucharro.reediteye.data.Comment;
import com.example.eduardocucharro.reediteye.data.Post;

/**
 * Created by eduardocucharro on 26/04/17.
 */

public class DetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_COMMENT = 1;
    private final LayoutInflater inflater;
    private final Post post;

    SortedList<Comment> list = new SortedList<>(Comment.class, new SortedList.Callback<Comment>() {
        @Override
        public int compare(Comment o1, Comment o2) {
            boolean b = o1.getDate().equals(o2.getDate());

            return b ? 0 : o1.getDate().after(o2.getDate()) ? 1 : -1;
        }

        @Override
        public void onChanged(int position, int count) {
            notifyItemRangeChanged(position, count);
        }

        @Override
        public boolean areContentsTheSame(Comment oldItem, Comment newItem) {
            return false;
        }

        @Override
        public boolean areItemsTheSame(Comment item1, Comment item2) {
            return item1.getId().equals(item2.getId());
        }

        @Override
        public void onInserted(int position, int count) {
            notifyItemRangeInserted(position, count);
        }

        @Override
        public void onRemoved(int position, int count) {
            notifyItemRangeRemoved(position, count);
        }

        @Override
        public void onMoved(int fromPosition, int toPosition) {
            notifyItemMoved(fromPosition, toPosition);
        }
    });

    public DetailsAdapter(Context context, Post post) {
        inflater = LayoutInflater.from(context);
        this.post = post;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == TYPE_COMMENT) {

            View view = inflater.inflate(R.layout.view_comment, parent, false);

            return new CommentViewHolder(view);
        }

        View view = inflater.inflate(R.layout.view_post, parent, false);

        return new PostViewHolder(view, null) ;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof CommentViewHolder) {
            CommentViewHolder commentViewHolder = (CommentViewHolder)holder;
            Comment comment = list.get(position - 1);
            commentViewHolder.bind(comment);
            return;
        }

        PostViewHolder postViewHolder = (PostViewHolder)holder;
        postViewHolder.bind(post);
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0) {
            return TYPE_HEADER;
        }
        return TYPE_COMMENT;
    }

    public void addComment(Comment comment) {
        list.add(comment);
    }
}
