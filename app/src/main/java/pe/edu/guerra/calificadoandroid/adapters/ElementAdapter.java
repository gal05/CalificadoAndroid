package pe.edu.guerra.calificadoandroid.adapters;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.guerra.calificadoandroid.R;
import pe.edu.guerra.calificadoandroid.models.Elemento;

/**
 * Created by Alumno on 6/04/2018.
 */

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ViewHolder> {

    private List<Elemento>elemento;

    public void setElemento(List<Elemento> elemento) {
        this.elemento = elemento;
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{


        //ImageView pictureImage;
        TextView tituloText;
        TextView direccionText;
        TextView telefonoText;

        public ViewHolder(View itemView) {
            super(itemView);
           tituloText= itemView.findViewById(R.id.titulo_text);
            direccionText=itemView.findViewById(R.id.direccion_text);
            telefonoText=itemView.findViewById(R.id.telefono_text);
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        ViewHolder viewHolder=new ViewHolder(itemview);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Elemento element=elemento.get(position);
        holder.direccionText.setText(element.getTitulo());
        holder.tituloText.setText(element.getTitulo());
        holder.telefonoText.setText(String.valueOf( element.getTelefono()));

    }

    @Override
    public int getItemCount() {
        return elemento.size();
    }


}
