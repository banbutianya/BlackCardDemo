package com.bignerdranch.android.blackcarddemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by acer-1 on 2017/9/26.
 */

public class BkhomeRecyclerViewAdapter extends RecyclerView.Adapter{

    //区分显示哪种类型的item
    // 用户信息
    public static int USER_INFORMATION = 1;

    //私人管家服务
    public static int PERSONAL_BUTLER = 2;

    //青黑俱乐部
    public static int THE_CLUB = 3;

    //会员专享
    public static int EXCLUSIVE = 4;


    //设置当前类型
    public int mCurrentType = USER_INFORMATION;

    private Context mContext;





    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public int getItemType(int position){
        return super.getItemViewType(position);
    }
}
