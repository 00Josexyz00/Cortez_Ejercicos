package xyz.app.ejercicio7textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;


    private String[] paises={"Argentina","Chile","Paraguay","Bolivia","Peru","Ecuador",
            "Brasil","Colombia","Venezuela","Uruguay"};
    private String[] habitantes={"4000000","1700000","1521515","5444666","10000000",
            "1555555","155555","454554","154455445","1545554"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("Poblacion de: "+lv1.getItemAtPosition(position)+" es: "
                +habitantes[position]);
            }
        });

    }
}