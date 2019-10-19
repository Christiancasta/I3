package mx.gob.pt2ictea.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import mx.gob.pt2ictea.Activities.MainActivity;
import mx.gob.pt2ictea.Functions.BackgroundTask;
import mx.gob.pt2ictea.R;

public class formulario extends AppCompatActivity {

    EditText nombre, telefono, curso, plantel, comentarios;
    Spinner curso1, plantel1;
    String str_nombre, str_telefono, str_curso, str_plantel, str_comentarios, str_curso1, str_plantel1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nombre = (EditText) findViewById(R.id.lbl_nombre);
        telefono = (EditText) findViewById(R.id.lbl_telefono);
        /*curso = (EditText) findViewById(R.id.lbl_curso);
        plantel = (EditText) findViewById(R.id.lbl_plantel);*/
        comentarios = (EditText) findViewById(R.id.lbl_comentarios);
        curso1 = (Spinner) findViewById(R.id.spinnerCurso);
        plantel1 = (Spinner) findViewById(R.id.spinnerPlantel);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(formulario.this, MainActivity.class));
                //Snackbar.make(view, "Compartir", Snackbar.LENGTH_LONG)
                //.setAction("Action", null).show();
            }
        });
    }

    public void OnReg(View view){
        str_nombre = nombre.getText().toString();
        str_telefono = telefono.getText().toString();
        str_comentarios = comentarios.getText().toString();
        str_curso1 = curso1.getSelectedItem().toString();
        str_plantel1 = plantel1.getSelectedItem().toString();/*
        str_curso = curso.getText().toString();
        str_plantel = plantel.getText().toString();*/
        String method = "formulario";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, str_nombre, str_telefono, str_curso1, str_plantel1, str_comentarios);
        finish();

    }
}