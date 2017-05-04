package movil.unicauca.peliculas;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

import movil.unicauca.peliculas.adapters.EstrenoAdapter;
import movil.unicauca.peliculas.adapters.ProximoEstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.util.Data;
import movil.unicauca.peliculas.util.Datape;

public class MoviesActivity extends AppCompatActivity implements  EstrenoAdapter.OnEstrenoSelected, ProximoEstrenoAdapter.OnProxEstrenoSelected, View.OnClickListener {

    ActivityMoviesBinding binding;
    EstrenoAdapter adapter;
    ProximoEstrenoAdapter adapter1;

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


    }

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
}
