package com.mohanadalkrunz99.firebaseauth.adapters;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteBookAdapter extends RecyclerView.Adapter<NoteBookAdapter.NoteBookViewHolder> {


    @NonNull
    @Override
    public NoteBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteBookViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NoteBookViewHolder extends RecyclerView.ViewHolder{

        public NoteBookViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
