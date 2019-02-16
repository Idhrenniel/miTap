package com.marques.xavier.mitap;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button submitRegister = (Button) findViewById(R.id.registerSubmitButton);

        submitRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //id no null
                //System.out.println((EditText) findViewById(R.id.registerEditTextID).getTextAlignment());
                EditText id = (EditText) findViewById(R.id.registerEditTextID);
                EditText pass1 = (EditText) findViewById(R.id.registerEditTextPassword);
                EditText pass2 = (EditText) findViewById(R.id.registerEditTextConfPassword);
                EditText phone = (EditText) findViewById(R.id.registerEditTextPhone);

                if(id.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "ID text field may be empty.",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
                //both pass no null
                else if(pass1.getText().toString().equals("") || pass2.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "'Password' or 'Confirm Password' text field may be empty.",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
                //both pass are equal
                else if(!(pass1.getText().toString().equals(pass2.getText().toString()))){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Passwords may not be equal.",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
                //phone no null
                else if(phone.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Phone number field may be empty.",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
                //all ok
                else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Registering Succeeded.",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }
            }
        });
    }
}
