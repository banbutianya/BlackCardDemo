package com.bignerdranch.android.blackcarddemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.bignerdranch.android.blackcarddemo.card.CardFragment;
import com.bignerdranch.android.blackcarddemo.club.ClubFragment;
import com.bignerdranch.android.blackcarddemo.enjoy.EnjoyFragment;
import com.bignerdranch.android.blackcarddemo.mine.MineFragment;
import com.bignerdranch.android.blackcarddemo.stewards.StewardsFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View mBlack_card,mBlack_club,mBlack_stewards,mBlack_enjoy,mBlack_mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.black_card_home);

        //去掉最上面的通知栏
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mBlack_card = findViewById(R.id.black_card);
        mBlack_club = findViewById(R.id.black_club);
        mBlack_stewards = findViewById(R.id.black_stewards);
        mBlack_enjoy = findViewById(R.id.black_enjoy);
        mBlack_mine = findViewById(R.id.black_mine);

        mBlack_card.setOnClickListener(this);
        mBlack_club.setOnClickListener(this);
        mBlack_stewards.setOnClickListener(this);
        mBlack_enjoy.setOnClickListener(this);
        mBlack_mine.setOnClickListener(this);

        mBlack_card.performClick();

    }



    @Override
    public void onClick(View v) {
        mBlack_card.setSelected(false);
        mBlack_club.setSelected(false);
        mBlack_stewards.setSelected(false);
        mBlack_enjoy.setSelected(false);
        mBlack_mine.setSelected(false);

        v.setSelected(true);

        //开启事务，动态添加fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();

        switch (v.getId()){
            case R.id.black_card:
                ft.replace(R.id.fragment_content,new CardFragment());
                break;
            case R.id.black_club:
                ft.replace(R.id.fragment_content,new ClubFragment());
                break;
            case R.id.black_stewards:
                ft.replace(R.id.fragment_content,new StewardsFragment());
                break;
            case R.id.black_enjoy:
                ft.replace(R.id.fragment_content,new EnjoyFragment());
                break;
            case R.id.black_mine:
                ft.replace(R.id.fragment_content,new MineFragment());
                break;
        }

        //提交事务
        ft.commit();
    }
}
