package com.example.eduardocucharro.reediteye.feed;

import android.content.Context;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eduardocucharro.reediteye.R;
import com.example.eduardocucharro.reediteye.data.Post;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class FeedAdapter extends RecyclerView.Adapter<PostViewHolder> implements
        PostViewHolder.ViewHolderListener {

    private PostClickListener postClickListener;
    private CommentsClickListener commentsClickListener;
    private BrowseClickListener browseClickListener;

    public int getPostPosition(Post post) {
        return list.indexOf(post);
    }

    public int totalItems() {
        return list.size();
    }

    public interface PostClickListener {
        void onPostClick(Post post);
    }

    public interface CommentsClickListener {
        void onCommentsClick(Post post);
    }

    public interface BrowseClickListener {
        void onBrowseClick(Post post);
    }

    public Post getTailPost() {
        return list.size() > 0 ? list.get(list.size() - 1) : null;
    }

    private final LayoutInflater inflater;

    SortedList<Post> list = new SortedList<>(Post.class, new SortedList.Callback<Post>() {
        @Override
        public int compare(Post o1, Post o2) {
            boolean b = o1.getDate().equals(o2.getDate());

            return b ? 0 : o1.getDate().after(o2.getDate()) ? -1 : 1;
        }

        @Override
        public void onChanged(int position, int count) {
            notifyItemRangeChanged(position, count);
        }

        @Override
        public boolean areContentsTheSame(Post oldItem, Post newItem) {
            return false;
        }

        @Override
        public boolean areItemsTheSame(Post item1, Post item2) {
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

    public FeedAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.view_post, parent, false);

        return new PostViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    public void addPostClickListener(PostClickListener postClickListener) {
        this.postClickListener = postClickListener;
    }

    public void addBrowseClickListener(BrowseClickListener browseClickListener) {
        this.browseClickListener = browseClickListener;
    }

    public void addCommentsClickListener(CommentsClickListener commentsClickListener) {
        this.commentsClickListener = commentsClickListener;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addPost(Post post) {
        list.add(post);
    }

    @Override
    public void onPostClick(Post post) {
        if(postClickListener != null) {
            postClickListener.onPostClick(post);
        }
    }

    @Override
    public void onCommentsClick(Post post) {
        if(commentsClickListener != null) commentsClickListener.onCommentsClick(post);
    }

    @Override
    public void onShareClick(Post post) {
        if(browseClickListener != null) browseClickListener.onBrowseClick(post);
    }
}
