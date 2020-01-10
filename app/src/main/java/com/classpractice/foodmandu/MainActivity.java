package com.classpractice.foodmandu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.classpractice.foodmandu.Adapter.RecycleViewAdapter;
import com.classpractice.foodmandu.Bll.ItemBll;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private RecyclerView item_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PopulateRecyclerViewList();
        navigations();

    }

    public void  PopulateRecyclerViewList(){
        item_recyclerView= findViewById(R.id.itemlists);
        ItemBll itemBll= new ItemBll();
        RecycleViewAdapter itemRecyclerAdapter= new RecycleViewAdapter(this, itemBll.getAllItems());
        item_recyclerView.setAdapter(itemRecyclerAdapter);
        item_recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
    public void navigations(){
        dl = findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        t.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                dl.closeDrawer(GravityCompat.START);
                switch(id)
                {
                    case R.id.navone:
                        Toast.makeText(MainActivity.this, "heheh clicked", Toast.LENGTH_SHORT).show();
                    case R.id.uploadmage:
                        Toast.makeText(MainActivity.this, "Upload File ", Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }

            }
        });
    }
}
