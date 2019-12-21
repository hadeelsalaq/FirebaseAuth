package com.mohanadalkrunz99.firebaseauth.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {


    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class NoteViewHolder extends RecyclerView.ViewHolder{

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
