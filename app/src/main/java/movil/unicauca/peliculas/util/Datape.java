package movil.unicauca.peliculas.util;

import java.util.ArrayList;
import java.util.List;

import movil.unicauca.peliculas.models.ProximosEstrenos;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class Datape {

    private static List<ProximosEstrenos> datape;

    public static List<ProximosEstrenos> getDatape(){
        if (datape == null){
            datape = new ArrayList<>();

            ProximosEstrenos pe1 = new ProximosEstrenos();
            pe1.setNamepe("Rapido y Peludo");
            pe1.setDateofpremier("8 de mayo de 2017");
            pe1.setImagepe("https://i.ytimg.com/vi/JkHGQ1IewOU/maxresdefault.jpg");
            pe1.setDurationpe("120 minutos");
            //para el boton mirar video de databinding 1 en el 58:00 del 2016

            ProximosEstrenos pe2 = new ProximosEstrenos();
            pe2.setNamepe("Alien: Covenant");
            pe2.setDateofpremier("15 de mayo 2017");
            pe2.setImagepe("http://s3.foxmovies.com/foxmovies/production/films/135/images/feature/alien-film-header-desktop-v2-front-main-stage.jpg");
            pe2.setDurationpe("100 minutos");

            ProximosEstrenos pe3 = new ProximosEstrenos();
            pe3.setNamepe("Guardianes de la Bahia");
            pe3.setDateofpremier("2 de julio de 2017");
            pe3.setImagepe("http://www.impulsonegocios.com/resources/original/IN_2015/-norberto2017/baywatch-pelicula-2017-zac-efron-30122016.jpg");
            pe3.setDurationpe("130 minutos");

            ProximosEstrenos pe4 = new ProximosEstrenos();
            pe4.setNamepe("Colosal");
            pe4.setDateofpremier("21 de junio de 2017");
            pe4.setImagepe("http://gnula.com.ar/wp-content/uploads/2017/03/Colossal_poster_latino.jpg");
            pe4.setDurationpe("130 minutos");

            ProximosEstrenos pe5 = new ProximosEstrenos();
            pe5.setNamepe("x-500");
            pe5.setDateofpremier("25 de junio de 2017");
            pe5.setImagepe("http://www.canaltr3ce.co/wp-content/uploads/2017/04/Captura-de-pantalla-2017-04-25-a-las-6.56.00-p.m..png");
            pe5.setDurationpe("120 minutos");

            ProximosEstrenos pe6 = new ProximosEstrenos();
            pe6.setNamepe("La Mujer Maravilla");
            pe6.setDateofpremier("1 de agosto de 2017");
            pe6.setImagepe("http://media.ultimahora.com/adjuntos/161/imagenes/003/328/0003328988.jpg");
            pe6.setDurationpe("130 minutos");

            datape.add(pe1);
            datape.add(pe2);
            datape.add(pe3);
            datape.add(pe4);
            datape.add(pe5);
            datape.add(pe6);


        }
        return datape;
    }

}
