package com.ismailhakkiaydin.fragtofragdatagonder;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sayilariTopla(int sayi1, int sayi2) {

        FragmentManager manager=getFragmentManager();

        FragmentB fragmentB= (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.sayilariTopla(sayi1, sayi2);

    }


}