package com.camden.doplus.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.camden.doplus.Holders.ImageViewHolder;
import com.camden.doplus.Holders.NoteViewHolder;
import com.camden.doplus.Holders.TodoViewHolder;
import com.camden.doplus.Models.RecordModel;
import com.camden.doplus.R;

import java.util.ArrayList;
import java.util.List;

public class NotebookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater mlayoutInflater;
    public static Context mContext;
    private List<RecordModel> records = new ArrayList<>();

    public NotebookAdapter(Context context) {

        mlayoutInflater = LayoutInflater.from(context);
        mContext = context;

    }

    public void addList(List<RecordModel> list){
        records.addAll(list);
    }

    @Override
    public int getItemViewType(int position) {
        return records.get(position).getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        switch (i){
            case 1:
                return new NoteViewHolder(mlayoutInflater.inflate(R.layout.item_note,viewGroup,
                        false));
            case 2:
                return new ImageViewHolder(mlayoutInflater.inflate(R.layout.item_image,viewGroup,
                        false));
            case 3:
                return new TodoViewHolder(mlayoutInflater.inflate(R.layout.item_todo,viewGroup,
                        false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int viewType = getItemViewType(i);

        switch (viewType){
            case 1:
                ((NoteViewHolder)(viewHolder)).BindHolder(records.get(i));
                break;
            case 2:
                ((ImageViewHolder)(viewHolder)).BindHolder(records.get(i));
                break;
            case 3:
                ((TodoViewHolder)(viewHolder)).BindHolder(records.get(i));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return records.size();
    }
}
