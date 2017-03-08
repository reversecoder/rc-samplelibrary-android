package com.reversecoder.githubmavenrepo.android;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by alam on 3/2/17.
 */

public class AndroidView {

    Context mContext;
    public AndroidView(Context context){
        mContext=context;
    }

    public void showAndroidView(){
        Toast.makeText(mContext,"I am from Android view.",Toast.LENGTH_SHORT).show();
    }
}
