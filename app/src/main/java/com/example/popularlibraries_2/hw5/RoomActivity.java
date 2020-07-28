package com.example.popularlibraries_2.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.popularlibraries_2.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RoomActivity extends AppCompatActivity {

    RoomPresenter roomPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        roomPresenter = new RoomPresenter();

    }


    public void putData(View view) {

        roomPresenter.putData();

    }

    public void getData(View view) { roomPresenter.getData();
    }
}