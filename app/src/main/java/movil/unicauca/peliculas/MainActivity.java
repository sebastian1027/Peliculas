package movil.unicauca.peliculas;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.unicauca.peliculas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandler(this);
    }

    public void goToNext(){
        Intent intent = new Intent(this, MoviesActivity.class);
        startActivity(intent); //material design II
    }

    public void goToRegister(){
        Intent intent1 = new Intent(this, RegistroActivity.class);
        startActivity(intent1);
    }
}
