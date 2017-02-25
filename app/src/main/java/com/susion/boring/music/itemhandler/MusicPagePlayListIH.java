package com.susion.boring.music.itemhandler;

import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.susion.boring.R;
import com.susion.boring.base.SimpleItemHandler;
import com.susion.boring.base.ViewHolder;
import com.susion.boring.music.model.PlayList;

/**
 * Created by susion on 17/2/23.
 */
public class MusicPagePlayListIH extends SimpleItemHandler<PlayList> {


    private SimpleDraweeView mSDVCover;

    @Override
    public void onCreateItemHandler(ViewHolder vh, ViewGroup parent) {
        super.onCreateItemHandler(vh, parent);
        mSDVCover = vh.get(R.id.item_play_list_iv_cover);
    }

    @Override
    public void onBindDataView(ViewHolder vh, PlayList data, int position) {
        mSDVCover.setImageURI(data.getCoverImgUrl());
        vh.getTextView(R.id.item_play_list_tv_name).setText(data.getName());
        vh.getTextView(R.id.item_play_list_tv_play_count).setText(data.getPlayCount()+"");
    }

    @Override
    public int getLayoutResId() {
        return R.layout.item_music_play_list;
    }

    @Override
    public void onClick(View v) {

    }

}