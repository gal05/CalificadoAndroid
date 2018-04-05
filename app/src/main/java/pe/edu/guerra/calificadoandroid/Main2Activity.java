package pe.edu.guerra.calificadoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class Main2Activity extends AppCompatActivity {
    Button buscar;
    SearchView cajatexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buscar=(Button)findViewById(R.id.buscar2);


    }
    public void onClickAceptar(View view){


        //String aux_nombre = et_nombre.getText().toString();
        //String aux_apellido = et_apellido.getText().toString();

      //  if(!aux_nombre.matches("") && !aux_apellido.matches("")) {

            Intent i = new Intent(this, Main3Activity.class);
            i.putExtra("nombre", "lol");
            i.putExtra("apellido", "lolss");
            startActivity(i);
        }
       // else{
         //   Toast.makeText(getApplicationContext(), "Debe ingresar datos", Toast.LENGTH_SHORT).show();
       // }
    //}
}
