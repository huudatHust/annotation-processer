package com.jediteam.docsexample;

import androidx.annotation.BinderThread;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jediteam.binder.Binding;
import com.jediteam.binderannotations.BindView;
import com.jediteam.binderannotations.OnClick;

/**
 * MainActivity main start activyt of app
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt)
    TextView tvContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
        setDrawable(R.id.bottom);
    }

    @OnClick(R.id.txt)
    void bt1Click(View v){
        tvContent.setText("View is clicked");
    }


    @RequiresPermission(allOf = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_NETWORK_STATE})
    public void setDrawable(@DrawableRes  int drawable){
        findViewById(R.id.txt).setBackgroundColor(drawable);
    }




}
