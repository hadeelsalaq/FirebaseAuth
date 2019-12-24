package com.mohanadalkrunz99.firebaseauth.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohanadalkrunz99.firebaseauth.R;
import com.mohanadalkrunz99.firebaseauth.models.NoteBook;

import java.util.ArrayList;

public class NoteBookAdapter extends RecyclerView.Adapter<NoteBookAdapter.NoteBookViewHolder> {

    private Context context;
    private ArrayList<NoteBook> noteBooks;

    public NoteBookAdapter(Context context, ArrayList<NoteBook> noteBooks) {
        this.context = context;
        this.noteBooks = noteBooks;
    }

    @NonNull
    @Override
    public NoteBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notebook_cell,parent,false);

        return new NoteBookViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull NoteBookViewHolder holder, int position) {

        holder.noteBookTitle.setText(noteBooks.get(position).getNoteBookName());
        holder.noteBookTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "click"+ noteBooks.get(position).getNoteBookName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return noteBooks.size();
    }

    class NoteBookViewHolder extends RecyclerView.ViewHolder{

        TextView noteBookTitle;
        public NoteBookViewHolder(@NonNull View itemView) {
            super(itemView);
            noteBookTitle = itemView.findViewById(R.id.noteBookTitle);
        }
    }
}
