package com.example.popularlibraries_2.hw2.third;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class ThirdActivity extends AppCompatActivity implements Constants {

    private MessagePresenter msgPresenter;
    private Observable<String> observable;
    private TextView msgView;
    private Button subscribe;
    private Button unsubscribe;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        initView();
        msgPresenter = new MessagePresenter();
        observable = msgPresenter.getMessage();
        onClick();
    }

    private void onClick() {
        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        setLogMsg("onSubscribe");
                        ThirdActivity.this.disposable = d;
                    }

                    @Override
                    public void onNext(String s) {
                        setLogMsg("onNext");
                        msgView.setText(s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        setLogMsg("onError");
                    }

                    @Override
                    public void onComplete() {
                        setLogMsg("onComplete");
                    }
                });

            }
        });
        setLogMsg("subscribe: end");
        unsubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disposable.dispose();
            }
        });
    }

    private void setLogMsg(String msg) {
        Log.d(TAG, msg + " " + Thread.currentThread().getName());
    }

    private void initView() {
        subscribe = findViewById(R.id.hw3AddSubBtn);
        unsubscribe = findViewById(R.id.hw3DelSubBtn);
        msgView = findViewById(R.id.hw3MsgView);
    }
}