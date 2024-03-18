package com.aisoft.meowbottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Home extends AppCompatActivity {

    MeowBottomNavigation meowBottomNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


//find==================================================================
        meowBottomNavigation = findViewById(R.id.meowBottomNavigation);

        //Je button ti set thakbe app open korle ta code
        meowBottomNavigation.show(3,true);


        //item============start=============================================

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.user));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.share));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.home));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.star));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.insurance));


        //item============end==========================================





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}