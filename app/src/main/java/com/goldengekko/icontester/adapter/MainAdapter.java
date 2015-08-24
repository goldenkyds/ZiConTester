package com.goldengekko.icontester.adapter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.goldengekko.icontester.util.IconResizer;
import com.goldengekko.icontester.R;

import java.util.List;

/**
 * Created by gguser on 8/18/15.
 */
public class MainAdapter extends BaseAdapter {


    private Activity mActivity;
    private List<Drawable> mDrawables;

    public MainAdapter(Activity activity, List<Drawable> drawables) {
        mActivity = activity;
        mDrawables = drawables;
        mDrawables.add(mActivity.getResources().getDrawable(R.drawable.add));
    }

    @Override
    public int getCount() {
        return mDrawables == null ? 0 : mDrawables.size();
    }

    @Override
    public Drawable getItem(int position) {
        return mDrawables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        if (convertView == null) {
            convertView = LayoutInflater.from(mActivity).inflate(R.layout.icon_layout, parent, false);
            holder.icon = (ImageView) convertView.findViewById(R.id.icon_id);
            holder.name = (TextView) convertView.findViewById(R.id.name_id);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        if (position == 0) {
            holder.name.setText(R.string.add_icon);
            holder.icon.setImageDrawable(mDrawables.get(position));
        } else {
            holder.name.setText(R.string.zi_con);
            holder.icon.setImageDrawable(IconResizer.getIcon(mActivity, mDrawables.get(position)));
        }
        return convertView;
    }

    private class Holder {
        ImageView icon;
        TextView name;
    }
}
