package fisei.uta.edu.ec.velasteguipaolap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText n;
    private EditText a;
    private EditText b;
    private EditText e;
    private EditText f;
    private EditText p;

    private Button mos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n=findViewById(R.id.txt_leerNombre);
        a=findViewById(R.id.txt_leerApellido);
        b=findViewById(R.id.txt_leerBase);
        e=findViewById(R.id.txt_leerExpon);
        p=findViewById(R.id.txt_potencia);
        f=findViewById(R.id.txt_factorial);

        mos = findViewById(R.id.btn_Mostrar);

        String nombr = getIntent().getStringExtra("nombre");
        n.setText(nombr);

        String ape = getIntent().getStringExtra("apellido");
        a.setText(ape);

        String bas = getIntent().getStringExtra("base");
        b.setText(bas);

        String exp = getIntent().getStringExtra("exponen");
        e.setText(exp);




        if (a.length()==0){
            mos.setEnabled(false);
        }else{
            mos.setEnabled(true);
        }
    }

    public void Seguir(View view){
        Intent siguiente = new Intent(this, MainActivity2.class );
        startActivity(siguiente);

    }

    public void Mostrar(View view) {

        String num = getIntent().getStringExtra("numero");

        String pot = b.getText().toString();
        String exp = e.getText().toString();

        double nume = Double.parseDouble(num);
        double base = Double.parseDouble(pot);
        int expo = Integer.parseInt(exp);


        int iFactorial = 1;
        for (int x = 2; x <= nume; x++)
            iFactorial = iFactorial * x;


        double result = 1;
        while (expo != 0) {
            result = result * base;
            expo--;


            String res = String.valueOf(iFactorial);
            f.setText(res);

            String resp = String.valueOf(result);
            p.setText(resp);

        }
    }
}