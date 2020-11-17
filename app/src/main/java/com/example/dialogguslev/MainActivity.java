package com.example.dialogguslev;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnfon;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfon = (Button)findViewById(R.id.button);
        constraintLayout = (ConstraintLayout)findViewById(R.id.FonGuslev);
        context = MainActivity.this;

        btnfon.setOnClickListener(this);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onClick(View view) {

        final CharSequence[] items = {getText(R.string.red),getText(R.string.Yellow),getText(R.string.Green)};
        btnfon.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onClick(DialogInterface dialog, int item) {
            switch (item){

                case 0:
                    constraintLayout.setBackgroundResource(R.color.redColor);
                    Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    constraintLayout.setBackgroundResource(R.color.yelloyColor);
                    Toast.makeText(context, R.string.Yellow, Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    constraintLayout.setBackgroundResource(R.color.greenColor);
                    Toast.makeText(context, R.string.Green, Toast.LENGTH_LONG).show();
                    break;
            }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}