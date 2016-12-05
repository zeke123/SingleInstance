package com.zhoujian.singgleinstance.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.zhoujian.singgleinstance.R;
import com.zhoujian.singgleinstance.single.SingleTwo;

public class MainActivity extends Activity
{

    private SingleTwo mInstanceone;
    private SingleTwo mInstanceteo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInstanceone = SingleTwo.getSingleInstance();

        mInstanceteo =  SingleTwo.getSingleInstance();

        if (mInstanceone==mInstanceteo)
        {
            Toast.makeText(this, "两个对象是同一个对象", Toast.LENGTH_SHORT).show();
        }
    }
}
