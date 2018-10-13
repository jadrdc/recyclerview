package agustinreinoso.altice.com.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import agustinreinoso.altice.com.recyclerviews.models.Carro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =findViewById(R.id.recycler_list);
        recyclerView.setLayoutManager(new LinearLayoutManager( this, LinearLayoutManager.VERTICAL,false));
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Carro("Honda","Japon"));
        carros.add(new Carro("Toyota","Japon"));
        carros.add(new Carro("Nissan","Japon"));
       carros.add(new Carro("Ford","Estados Unidos"));
       carros.add(new Carro("Chevrolet","Estados Unidos"));
       carros.add(new Carro("Kia","Corea del Sur"));
       carros.add(new Carro("Hyundai","Corea del Sur"));
       carros.add(new Carro("Ferrari","Italia"));
       carros.add(new Carro("Maserati","Italia"));

        recyclerView.setAdapter(new CarroAdapter(getApplicationContext(),carros));
    }
}
