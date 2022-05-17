package fisei.uta.edu.ec.velasteguipaolap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText nombre;
    private EditText base;
    private Button cerr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = findViewById(R.id.txt_mostrNombr);
        base = findViewById(R.id.txt_mostrarBase);
        cerr = findViewById(R.id.btn_cerrar);

        String nombr = getIntent().getStringExtra("nombre");
        nombre.setText(nombr);

        String bas = getIntent().getStringExtra("base");
        base.setText(bas);




    }

    public void Siguiente2(View view){
        Intent siguiente = new Intent(this, MainActivity3.class );
        startActivity(siguiente);

    }
    public void Cerrar2(View view){
        Intent siguiente = new Intent(this, MainActivity.class );
        String apellido = getIntent().getStringExtra("apellido");
        String exponente = getIntent().getStringExtra("exponen");
        String numero = getIntent().getStringExtra("numero");


        String nmb = nombre.getText().toString();
        String bas = base.getText().toString();

        siguiente.putExtra("apellido", apellido);
        siguiente.putExtra("nombre", nmb);
        siguiente.putExtra("base",bas);
        siguiente.putExtra("exponen",exponente);
        siguiente.putExtra("numero",numero);

        startActivity(siguiente);
    }
}