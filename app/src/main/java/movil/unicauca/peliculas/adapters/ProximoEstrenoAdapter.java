package movil.unicauca.peliculas.adapters;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import movil.unicauca.peliculas.MoviesActivity;
import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.databinding.FragmentProximosEstrenosBinding;
import movil.unicauca.peliculas.models.ProximosEstrenos;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class ProximoEstrenoAdapter extends RecyclerView.Adapter<ProximoEstrenoAdapter.PEHolder>{

    public interface OnProxEstrenoSelected{
        void onProxEstreno(int position);
    }

    LayoutInflater inflater;
    List<ProximosEstrenos> datape;

    public ProximoEstrenoAdapter(LayoutInflater inflater, List<ProximosEstrenos> datape, OnProxEstrenoSelected onProxEstrenoSelected) {
        this.inflater = inflater;
        this.datape = datape;
        this.onProxEstrenoSelected = onProxEstrenoSelected;
    }

    OnProxEstrenoSelected onProxEstrenoSelected;


    @Override
    public PEHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.fragment_proximos_estrenos, parent, false);
        return new PEHolder(v);
    }

    @Override
    public void onBindViewHolder(PEHolder holder, int position) {
        ProximosEstrenos pe = datape.get(position);
        holder.binding.setProximosestrenos(pe);
        holder.binding.getRoot().setTag(position);
        holder.binding.setHandler(this);

    }

    @Override
    public int getItemCount() {
        return datape.size();
    }

    public void onClick(View view){
        int pos = (int) view.getTag();
        onProxEstrenoSelected.onProxEstreno(pos);
    }


    //region ViewHolder
    static class PEHolder extends RecyclerView.ViewHolder{

        FragmentProximosEstrenosBinding binding;

        public PEHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}
