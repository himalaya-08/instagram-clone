package com.example.instagramclone.views;

import android.content.Context;
import android.view.View;

import com.example.instagramclone.R;

public class PageTwoView {
    private Context mContext;

    public PageTwoView(Context mContext) {
        this.mContext = mContext;
    }

    public View getView() {
        return View.inflate(mContext, R.layout.page_two_main_layout, null);
    }
}
