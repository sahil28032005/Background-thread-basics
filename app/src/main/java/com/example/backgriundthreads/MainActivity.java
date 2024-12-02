package com.example.backgriundthreads;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.util.Log;
import android.widget.*;
import java.lang.Thread;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    anotherClass anc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "thread is being started", Toast.LENGTH_SHORT).show();
//        try {
//            Thread.sleep(5000);//here we actually stoppped main thread which control whole user interface and layout it might be an main thread
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "called method to render xml", Toast.LENGTH_SHORT).show();
        try {
            Thread.sleep(5000);//here we actually stoppped main thread which control whole user interface and layout it might be an main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        anc= new anotherClass();
        anc.start();

    }


}

class anotherClass extends Thread{

    @Override
    public void run() {

        try {
            for(int y=0;y<=30;y++){
              Log.d("TAG",""+y);
              Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}