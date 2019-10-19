package mx.gob.pt2ictea.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import mx.gob.pt2ictea.Fragments.AcercaDe;
import mx.gob.pt2ictea.Fragments.Ictea;
import mx.gob.pt2ictea.Fragments.PeriodosIns;
import mx.gob.pt2ictea.Functions.Functions;
import mx.gob.pt2ictea.R;
import mx.gob.pt2ictea.Fragments.Ubicacion2;
import mx.gob.pt2ictea.Fragments.formulario;
import mx.gob.pt2ictea.Fragments.plantel;
import mx.gob.pt2ictea.Fragments.servicios;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Opcion de ajustes
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Boton flotante con la opcion de compartir RF03
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, formulario.class));
                //Snackbar.make(view, "Compartir", Snackbar.LENGTH_LONG)
                //.setAction("Action", null).show();
            }
        });

        //Opcion para abrir y/o cerrar layout del menu
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_menu);
        navigationView.setNavigationItemSelectedListener(this);

        Ictea ictea = new Ictea();
        Functions.changeMainFragment(MainActivity.this, ictea);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_periodo_ins:
                Intent i = new Intent(MainActivity.this, formulario.class);
                MainActivity.this.startActivity(i);
                return true;

                default:
                    return super.onOptionsItemSelected(item);
                }
                }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    //Metodo para seleccionar los modulos del menu principal
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_periodo_ins) {
            PeriodosIns periodosIns = new PeriodosIns();
            Functions.changeMainFragment(MainActivity.this, periodosIns);

        } else if (id == R.id.nav_servicios) {
            servicios serv = new servicios();
            Functions.changeMainFragment(MainActivity.this, serv);

        } else if (id == R.id.nav_plantel) {
            plantel pla = new plantel();
            Functions.changeMainFragment(MainActivity.this, pla);

        } else if (id == R.id.nav_ubicacion) {
            Ubicacion2 ubicacion = new Ubicacion2();
            Functions.changeMainFragment(MainActivity.this, ubicacion);

        } else if (id == R.id.nav_acerca_de) {
            AcercaDe acercaDe = new AcercaDe();
            Functions.changeMainFragment(MainActivity.this, acercaDe);

        }else if (id == R.id.nav_ICTEA) {
            Ictea ictea = new Ictea();
            Functions.changeMainFragment(MainActivity.this, ictea);

        }else if (id == R.id.nav_info) {
            Intent i = new Intent(MainActivity.this, formulario.class);
            MainActivity.this.startActivity(i);
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}