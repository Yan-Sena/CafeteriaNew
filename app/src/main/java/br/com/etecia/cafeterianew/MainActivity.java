package br.com.etecia.cafeterianew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CoffeeFragment coffeeFragment = new CoffeeFragment();
    CookiesFragment cookiesFragment = new CookiesFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    TeaFragment teaFragment = new TeaFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_view);

        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, coffeeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_coffee:

                        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, coffeeFragment).commit();

                        break;
                    case R.id.navigation_donuts:

                        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, cookiesFragment).commit();

                        break;
                    case R.id.navigation_muffin:

                        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, muffinFragment).commit();

                        break;
                    case R.id.navigation_tea:

                        getSupportFragmentManager().beginTransaction().replace(R.id.idContainer, teaFragment).commit();

                        break;
                }


                return false;
            }
        });


    }
}