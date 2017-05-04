package movil.unicauca.peliculas;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.databinding.ActivityMainBinding;

public class RegistroActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_registro);
        //binding.setHandler(this);

    }
    public void goToMain(){

        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2); //material design II
    }



}

