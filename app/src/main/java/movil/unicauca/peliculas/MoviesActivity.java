package movil.unicauca.peliculas;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.List;

import movil.unicauca.peliculas.adapters.EstrenoAdapter;
import movil.unicauca.peliculas.adapters.ProximoEstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.util.Data;
import movil.unicauca.peliculas.util.Datape;

public class MoviesActivity extends AppCompatActivity implements  EstrenoAdapter.OnEstrenoSelected, ProximoEstrenoAdapter.OnProxEstrenoSelected, View.OnClickListener, DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener {

    ActivityMoviesBinding binding;
    EstrenoAdapter adapter;
    ProximoEstrenoAdapter adapter1;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMoviesBinding binding = ActivityMoviesBinding.inflate(getLayoutInflater());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movies);

        adapter = new EstrenoAdapter(getLayoutInflater(), Data.getData(), this);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));
        //binding.list.setOnClickListener(this); //-->pq no aparece onItemClic


        adapter1 = new ProximoEstrenoAdapter(getLayoutInflater(), Datape.getDatape(), this);
        binding.list.setAdapter(adapter1);
        binding.list.setLayoutManager(new LinearLayoutManager(this));


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(this, binding.drawer, R.string.open, R.string.close);

        binding.drawer.addDrawerListener(this);
        binding.nav.setNavigationItemSelectedListener(this);
    }

    //region toggle


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        toggle.onDrawerSlide(drawerView, slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toggle.onDrawerOpened(drawerView);
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        toggle.onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toggle.onDrawerStateChanged(newState);
    }
    //endregion

    @Override
    public void onEstreno(int position) {

    }

    @Override
    public void onProxEstreno(int position) {

    }

    @Override
    public void onClick(View v) {  //--> pq  no aparece OnItemClic
        /*Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_POS, position);
        startActivity(intent);*/
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        binding.drawer.closeDrawers();
        switch (item.getItemId()){
            case R.id.nav_inicio:

                break;

            case R.id.nav_recordatorios:

                break;

            case R.id.nav_calificarpeliculas:

                break;

        }
        return false;
    }


}
