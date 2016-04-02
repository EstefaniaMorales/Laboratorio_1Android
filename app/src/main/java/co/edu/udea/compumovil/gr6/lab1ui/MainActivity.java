package co.edu.udea.compumovil.gr6.lab1ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String sex = "";
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nombre=(EditText)findViewById(R.id.nombres);
        final EditText apellido=(EditText)findViewById(R.id.apellidos);
        final RadioButton hombre=(RadioButton)findViewById(R.id.hombre);
        final RadioButton mujer=(RadioButton)findViewById(R.id.mujer);
        final EditText pais=(EditText)findViewById(R.id.pais);
        final EditText telefono=(EditText)findViewById(R.id.telefono);
        final EditText email=(EditText)findViewById(R.id.email);
        final DatePicker nacimiento=(DatePicker)findViewById(R.id.fechaNacimiento);
        Button mostrar=(Button)findViewById(R.id.btnMostrar);
        final Spinner spiner= (Spinner)findViewById(R.id.hobbies);


        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombres=nombre.getText().toString();
                String apellidos = apellido.getText().toString();
                String paiss= pais.getText().toString();
                String telefonoo = telefono.getText().toString();
                String hobbies=spiner.getSelectedItem().toString();
                int año=nacimiento.getYear();
                int mes=nacimiento.getMonth()+1;
                int dia=nacimiento.getDayOfMonth();
                StringBuffer fecha=new StringBuffer();
                 fecha.append("0").append(dia).append("/").append("0").append(mes).append("/").append(año);

                if(hombre.isChecked()){
                    sex="hombre";

                }
                if(mujer.isChecked()){
                    sex="Mujer";

                }

                StringBuffer concatenacion=new StringBuffer();
                        concatenacion.append("Nombre: ").append(nombres).append("\nApellidos: ").append(apellidos)
                                           .append("\nSexo: ") .append(sex) .append("\nfecha: ").append(fecha).append("\nPais: ").append(paiss).append("\nTelefono:").append(telefonoo).append("\nHobbies:").append(hobbies);

                        ((TextView) findViewById(R.id.mostrar)).setText(concatenacion);

            }
        });
  }
}
