package com.foromtb.luisromeral.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayListado = {"primero", "segundo","tercero","cuarto"};

        ListView ListViewListado = (ListView)findViewById(R.id.listado);
        Button ButtonBoton = (Button)findViewById(R.id.boton);
        EditText EditTextTexto = (EditText)findViewById(R.id.texto);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,R.layout.list_item_layout, R.id.textItem,arrayListado);

        ListViewListado.setAdapter(adaptador);






    }
}
