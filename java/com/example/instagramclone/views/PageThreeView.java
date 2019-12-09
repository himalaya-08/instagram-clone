package com.example.instagramclone.views;

import android.content.Context;
import android.view.View;

import com.example.instagramclone.R;

public class PageThreeView {
    private Context mContext;

    public PageThreeView(Context mContext) {
        this.mContext = mContext;
    }

    public View getView() {
        return View.inflate(mContext, R.layout.page_three_main_layout, null);
    }
}
