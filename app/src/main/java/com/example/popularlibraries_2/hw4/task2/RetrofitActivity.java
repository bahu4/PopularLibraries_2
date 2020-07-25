package com.example.popularlibraries_2.hw4.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;

public class RetrofitActivity extends AppCompatActivity implements Constants {

    private Presenter presenter;
    private ImageView avaView;
    private Button getAvaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        presenter = new Presenter();
        initView();
        getAvaBtn.setOnClickListener(view -> {
            presenter.getAvatar(avaView);
        });
    }

    private void initView() {
        avaView = findViewById(R.id.avaView);
        getAvaBtn = findViewById(R.id.getAvaBtn);
    }
}