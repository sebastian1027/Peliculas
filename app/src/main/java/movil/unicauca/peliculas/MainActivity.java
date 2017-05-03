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
    }

    public void goToNext(){
     //String usr = binding.usuario.getEditText().getText().toString();
     // String pass = binding.pass.getEditText().getText().toString();
        Intent intent = new Intent(this, MoviesActivity.class);
        startActivity(intent); //material design II
    }
}
