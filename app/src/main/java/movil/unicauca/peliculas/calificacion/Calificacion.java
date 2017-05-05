package movil.unicauca.peliculas.calificacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import movil.unicauca.peliculas.MoviesActivity;
import movil.unicauca.peliculas.R;

/**
 * Created by Sebastianl on 04/05/2017.
 */

public class Calificacion extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner moviesestrenos;
    String moviesestrenosData[];
    RatingBar ratingBar;
    Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.fragment_calificacion);

        moviesestrenos = (Spinner) findViewById(R.id.moviesestrenos);        
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);        

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Calificacion.this, "Start" + rating, Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.btnenviar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Calificacion.this, "Tus Comentarios fueron Enviados", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(this, MoviesActivity.class);
                //startActivity(intent);
            }
        });


        moviesestrenos.setOnItemSelectedListener(this);
        moviesestrenosData=getResources().getStringArray(R.array.moviesestrenos);
    }
    //region Spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
    //endregion




}
