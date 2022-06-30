package com.splash.sc;


import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitleTextColor(getResources().getColor(R.color.black));
		setSupportActionBar(toolbar);
		
		getSupportFragmentManager().beginTransaction().replace(R.id.page_container,  HomeFragment.newInstance()).commit();		
		
		BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
		bottomNav.setSelectedItemId(R.id.nav_home);
		bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item){
				Fragment select = null;
				switch (item.getItemId()){
					case R.id.nav_home:
					toolbar.setTitle("BukaToko");
					select = HomeFragment.newInstance();
					break;
					case R.id.nav_katalog:
					toolbar.setTitle("Katalog");
					select = KatalogFragment.newInstance();
					break;
					case R.id.nav_chat:
					toolbar.setTitle("Chat");
					select = ChatFragment.newInstance();
					break ;
					case R.id.nav_promosi:
					toolbar.setTitle("Promosi");
					select = PromosiFragment.newInstance();
					break ;
					case R.id.nav_aplikasi:
					toolbar.setTitle("Aplikasi");
					select = AplikasiFragment.newInstance();
					break ;
					
				}
					if (select != null){
						getSupportFragmentManager().beginTransaction().replace(R.id.page_container, select).commit();
						}
						return true;
			}
					
		});
		
		//penutup 
		}
	}
		
		