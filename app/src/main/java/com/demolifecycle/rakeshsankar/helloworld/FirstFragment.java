package com.demolifecycle.rakeshsankar.helloworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by rakesh sankar on 12/7/2017.
 */

public class FirstFragment extends Fragment {
    public  static final String activityName = "FirstFragment";
    View mFragmentView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(activityName,"OnCreate");
    }

    @Override
    public void setRetainInstance(boolean retain) {
        super.setRetainInstance(retain);
    }



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentView = inflater.inflate(R.layout.fragment1, container, false);
        Log.e(activityName,"onCreateView");
        Button button = mFragmentView.findViewById(R.id.buttonfirst);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmenttrans = getFragmentManager().beginTransaction();
                //fragmenttrans.addToBackStack("INCENTIVES_HOME");
                SecondFragment hammerInfoFragment = new SecondFragment();
                fragmenttrans.add(R.id.frameHolder, hammerInfoFragment,"SecondFragment");
                fragmenttrans.commit();
            }

        });
        return mFragmentView;
    }
    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e(activityName,"onAttachFragment");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(activityName,"onAttach");
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(activityName,"onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(activityName,"onStart");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(activityName,"onSaveInstanceState");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(activityName,"onViewStateRestored");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(activityName,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(activityName,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(activityName,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(activityName,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(activityName,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(activityName,"onDetach");
    }
}
