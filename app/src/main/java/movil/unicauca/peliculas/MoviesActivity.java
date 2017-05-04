package movil.unicauca.peliculas;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;

import java.util.List;

import movil.unicauca.peliculas.adapters.EstrenoAdapter;
import movil.unicauca.peliculas.databinding.ActivityMoviesBinding;
import movil.unicauca.peliculas.models.Estrenos;
import movil.unicauca.peliculas.util.Data;

public class MoviesActivity extends AppCompatActivity implements EstrenoAdapter.OnEstrenoSelected {

    ActivityMoviesBinding binding;
    EstrenoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movies);

        adapter = new EstrenoAdapter(getLayoutInflater(), Data.getData(), this);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onEstreno(int position) {

    }
}
