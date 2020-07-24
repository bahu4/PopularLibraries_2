package com.example.popularlibraries_2.hw3.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.popularlibraries_2.Constants;
import com.example.popularlibraries_2.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class HW3_FirstActivity extends AppCompatActivity implements Constants {

    Observable<String> observable;
    HW3_FirstPresenter presenter;
    Disposable disposable;

    @BindView(R.id.hw3SecodMsgView)
    TextView msgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_first);
        presenter = new HW3_FirstPresenter();
        observable = presenter.getMessage();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.hw3AddSubBtn)
    public void onClickAddBtn() {
        setLogMsg("subscribe");
        disposable = observable.filter(s-> s.contains("4")).observeOn(AndroidSchedulers.mainThread()).subscribe(s -> {
            msgView.setText(s);
            setLogMsg("onNext:");
        }, throwable -> {
            setLogMsg("onError");
        }, () -> {
            setLogMsg("onComplete");
        });
    }

    @OnClick(R.id.hw3DelBtn)
    public void onClickDelBtn() {
        disposable.dispose();
        setLogMsg("unsubscribe");
    }

    private void setLogMsg(String msg) {
        Log.d(TAG, msg + " " + Thread.currentThread().getName());
    }
}