package movil.unicauca.peliculas.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import movil.unicauca.peliculas.R;
import movil.unicauca.peliculas.databinding.TemplateEstrenosBinding;
import movil.unicauca.peliculas.models.Estrenos;

/**
 * Created by Sebastianl on 03/05/2017.
 */

public class EstrenoAdapter extends RecyclerView.Adapter<EstrenoAdapter.EstrenoHolder>{

    public interface OnEstrenoSelected{
        void onEstreno(int position);
    }
    LayoutInflater inflater;
    List<Estrenos> data;
    OnEstrenoSelected onEstrenoSelected;

    public EstrenoAdapter(LayoutInflater inflater, List<Estrenos> data, OnEstrenoSelected onEstrenoSelected) {
        this.inflater = inflater;
        this.data = data;
        this.onEstrenoSelected = onEstrenoSelected;
    }

    @Override
    public EstrenoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_estrenos, parent, false);
        return new EstrenoHolder(v);
    }

    @Override
    public void onBindViewHolder(EstrenoHolder holder, int position) {
        Estrenos e = data.get(position);
        holder.binding.setEstrenos(e);
        holder.binding.getRoot().setTag(position);
        holder.binding.setHandler(this);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onClick(View view){
        int pos = (int) view.getTag();
        onEstrenoSelected.onEstreno(pos);
    }

    //region ViewHolder
    static class EstrenoHolder extends RecyclerView.ViewHolder{

        TemplateEstrenosBinding binding;

        public EstrenoHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion
}
