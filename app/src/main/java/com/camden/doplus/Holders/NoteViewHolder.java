package com.camden.doplus.Holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.camden.doplus.Models.RecordModel;
import com.camden.doplus.R;

public class NoteViewHolder extends RecyclerView.ViewHolder {

    private TextView noteTitle;
    private TextView noteContent;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        noteTitle = itemView.findViewById(R.id.tv_note_title);
        noteContent = itemView.findViewById(R.id.tv_note_content);
    }

    public void BindHolder(RecordModel recordModel){
        noteTitle.setText(recordModel.getTitle());
        noteContent.setText(Html.fromHtml(recordModel.getContent()));
    }

}
