package net.smartbetter.utilslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import utilslibrary.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.i("JAVA", "onCreate");
    }
}
