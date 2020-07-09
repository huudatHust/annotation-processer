package com.jediteam.docsexample;

import androidx.annotation.BinderThread;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
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


    //Permission annotations
    @RequiresPermission(allOf = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_NETWORK_STATE})
    public void setDrawable(@DrawableRes  int drawable){
        findViewById(R.id.txt).setBackgroundColor(drawable);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    // @DrawableRes, @DimenRes, @ColorRes
    public  void setTitle(@StringRes int resId){

    }

    //Thread annotations


    //Value constraint annotations
    public void setAlpha(@IntRange(from=0,to=255) int alpha) {  }
    public void setAlpha(@FloatRange(from=0.0, to=1.0) float alpha) {}
    void getLocation(View button, @Size(min=1) int[] location) {
        button.getLocationOnScreen(location);
    }
}
