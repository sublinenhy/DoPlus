package com.camden.doplus.Holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.camden.doplus.Models.RecordModel;
import com.camden.doplus.R;

public class TodoViewHolder extends RecyclerView.ViewHolder {

    private TextView todoTitle;
    private TextView todoContent;

    public TodoViewHolder(@NonNull View itemView) {
        super(itemView);
        todoTitle = itemView.findViewById(R.id.tv_todo_title);
        todoContent = itemView.findViewById(R.id.tv_todo_content);
    }

    public void BindHolder(RecordModel recordModel){
        todoTitle.setText(recordModel.getTitle());
        todoContent.setText(Html.fromHtml(recordModel.getContent()));
    }
}
