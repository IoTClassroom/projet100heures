package com.lamy.mathilde.catholog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConnexionActivity extends AppCompatActivity {

    private EditText edtMail ;
    private EditText edtPassword ;
    private EditText edtConfirmation ;
    private Button btnConnexion ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMail = (EditText) findViewById(R.id.editTextMail);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);
        btnConnexion = (Button) findViewById(R.id.buttonConnexion);


        final String mail = edtMail.getText().toString();
        final String password = edtPassword.getText().toString();
         /* if (mail.equals("mathilde.lamy@hei.yncrea.fr")==true) {
            edtPassword.setVisibility(View.VISIBLE);
            if (password.equals("mathilde")==true){
                    btnConnexion.setVisibility(View.VISIBLE);
                        }
                    } */


            btnConnexion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mail.equals("jean.bon") == true && password.equals("jean") == true) {
                        Intent intent = new Intent(ConnexionActivity.this, MenuActivity.class);
                        intent.putExtra("cleNom", "Bonjour " + mail);
                        startActivityForResult(intent,1);
                    }
                }
            });

        }


    }

