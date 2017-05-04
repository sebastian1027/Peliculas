package movil.unicauca.peliculas.attrs;

import android.content.res.AssetManager;
import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class Attrs {

    @BindingAdapter("app:imgUrl")
    public static void setImage(ImageView img, String url){
        Picasso.with(img.getContext()).load(Uri.parse(url)).into(img);

    }
    @BindingAdapter("app:fontTtf")
    public static void loadFont(TextView txt, String font){
        AssetManager assetManager = txt.getContext().getAssets();
        Typeface typeface = Typeface.createFromAsset(assetManager, "fonts/"+font+".TTF");
        txt.setTypeface(typeface);
    }
}
