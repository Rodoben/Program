package com.example.ronaldbenjamin.program;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodMenu extends AppCompatActivity {
    private  Fragment1 fragment1;
    private  Fragment2 fragment2;
    private  Fragment3 fragment3;
    private  Fragment4 fragment4;
    private  Fragment5 fragment5;
    private  Fragment6 fragment6;
    private Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);


       fragment1=new Fragment1();
       fragment2=new Fragment2();
        fragment3=new Fragment3();
        fragment4=new Fragment4();
        fragment5=new Fragment5();
        fragment6=new Fragment6();

        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button7);
        b3=(Button)findViewById(R.id.button8);
        b4=(Button)findViewById(R.id.button9);
        b5=(Button)findViewById(R.id.button12);
        b6=(Button)findViewById(R.id.button13);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        replaceFragment(fragment1);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(fragment2);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
     replaceFragment(fragment3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(fragment4);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
replaceFragment(fragment5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(fragment6);

            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainframe,fragment);
        fragmentTransaction.commit();


    }
}
