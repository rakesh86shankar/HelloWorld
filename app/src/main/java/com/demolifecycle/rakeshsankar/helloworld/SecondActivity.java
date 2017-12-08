package com.demolifecycle.rakeshsankar.helloworld;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by rakesh sankar on 12/7/2017.
 */

public class SecondActivity extends AppCompatActivity {

    public  static final String activityName = "Second Activity";
    SecondActivity secondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        secondActivity = this;
        Log.e(activityName,"OnCreate");
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.secondButton);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          secondActivity.finish();
                                      }
                                  }
        );
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.e(activityName,"onCreateView");
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(activityName,"onContentChanged");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(activityName,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(activityName,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(activityName,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(activityName,"onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(activityName,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(activityName,"onRestoreInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(activityName,"onStop");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(activityName,"onAttachFragment");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(activityName,"onDestroy");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(activityName,"onAttachedToWindow");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e(activityName,"onDetachedFromWindow");
    }
}
