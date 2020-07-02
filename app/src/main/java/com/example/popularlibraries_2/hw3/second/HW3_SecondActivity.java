package com.example.popularlibraries_2.hw3.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class HW3_SecondActivity extends AppCompatActivity implements Constants {

    HW3_SecondPresenter presenter;
    Single<String> single;
    Disposable disposable;

    @BindView(R.id.hw3SecodMsgView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_second);
        ButterKnife.bind(this);
        presenter = new HW3_SecondPresenter();
        single = presenter.getMsg();
    }

    @OnClick(R.id.hw3GetMsgBtn)
    public void onClickBtn() {
        setLogMsg("subscribe");
        disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe( s -> {
            textView.setText(s);
            setLogMsg("onSuccess");
        }, throwable -> {
            setLogMsg("onError");
        });
    }

    private void setLogMsg(String msg) {
        Log.d(TAG, msg + " " + Thread.currentThread().getName());
    }
}