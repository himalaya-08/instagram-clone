package com.example.instagramclone.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.instagramclone.views.PageOneView;
import com.example.instagramclone.views.PageThreeView;
import com.example.instagramclone.views.PageTwoView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;

    public ViewPagerAdapter (Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view;
        switch (position) {
            case 0:
                view = new PageOneView(mContext).getView();
                container.addView(view);
                return view;
            case 1:
                view = new PageTwoView(mContext).getView();
                container.addView(view);
                return view;
            case 2:
                view = new PageThreeView(mContext).getView();
                container.addView(view);
                return view;
        }
        return null;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view = (View) object;
        container.removeView(view);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
