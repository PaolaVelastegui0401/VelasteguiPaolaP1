package fisei.uta.edu.ec.velasteguipaolap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText nom;
    private EditText ape;
    private EditText bas;
    private EditText exp;
    private EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nom=findViewById(R.id.txt_ingresarNom);
        ape=findViewById(R.id.txt_ingresarApellido);
        bas=findViewById(R.id.txt_ingresarBase);
        exp=findViewById(R.id.txt_IngresarExp);
        num=findViewById(R.id.txt_ingresarNum);

    }

    public void Cerrar(View view){
        Intent siguiente = new Intent(this, MainActivity2.class );
        String nomb = nom.getText().toString();
        String apell = ape.getText().toString();
        String base = bas.getText().toString();
        String exponen = exp.getText().toString();
        String numer = num.getText().toString();
        siguiente.putExtra("nombre", nomb);
        siguiente.putExtra("apellido", apell);
        siguiente.putExtra("base", base);
        siguiente.putExtra("exponen", exponen);
        siguiente.putExtra("numero", numer);
        startActivity(siguiente);


    }
}