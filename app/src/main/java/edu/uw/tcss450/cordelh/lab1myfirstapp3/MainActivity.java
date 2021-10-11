package edu.uw.tcss450.cordelh.lab1myfirstapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ONCREATE","Main Activity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ONSTART","Main Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("ONRESUME","Main Activity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ONPAUSE", "Main Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ONSTOP", "Main Activity onStop");
        //We might want to save app specific state to a DB, a file, a web service."
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ONDESTROY", "Main Activity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ONRESTART","Main Activity onRestart");
    }
}