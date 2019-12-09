package com.example.instagramclone.views;

import android.content.Context;
import android.view.View;

import com.example.instagramclone.R;

public class PageOneView {
    private Context mContext;

    public PageOneView(Context mContext) {
        this.mContext = mContext;
    }

    public View getView() {
        return View.inflate(mContext, R.layout.page_one_main_layout, null);
    }
}
