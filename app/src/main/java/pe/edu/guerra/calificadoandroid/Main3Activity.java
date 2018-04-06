package pe.edu.guerra.calificadoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.edu.guerra.calificadoandroid.adapters.ElementAdapter;
import pe.edu.guerra.calificadoandroid.repositories.ElementoRepository;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ElementAdapter elementAdapter=new ElementAdapter();
        elementAdapter.setElemento(ElementoRepository.getElementos());


        recyclerView.setAdapter(elementAdapter);
        ElementoRepository elementoRepository=new ElementoRepository();


    }
}
