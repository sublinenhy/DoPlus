package com.camden.doplus.Holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.camden.doplus.Adapters.NotebookAdapter;
import com.camden.doplus.Models.RecordModel;
import com.camden.doplus.R;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.iv_image);
    }

    public void BindHolder(RecordModel recordModel){

        Glide.with(NotebookAdapter.mContext).load(recordModel.getImageUrl()).into(image);

    }

}
