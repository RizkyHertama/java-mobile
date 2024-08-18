package com.example.javaretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/*
File ini adalah Adapter class yang menghubungkan data Post dengan tampilan (view) di dalam RecyclerView.
Ini memetakan data dari model (Post) ke layout item individu (seperti TextView) di RecyclerView.
 */

//Ketika extends dapat klik alt + enter untuk implement method lainnya yg dibutuhkan
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NotNull
    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.id.setText("id : "+ post.getId());
        holder.userId.setText("userId : " + post.getUserId());
        holder.title.setText("title : " + post.getTitle());
        holder.body.setText("body : " + post.getBody());
    }

    @Override
    public int getItemCount() {

        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView title, id, userId, body;
        public PostViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_tv);
            id = itemView.findViewById(R.id.id_tv);
            userId = itemView.findViewById(R.id.user_id_tv);
            body = itemView.findViewById(R.id.body_tv);
        }
    }
}
