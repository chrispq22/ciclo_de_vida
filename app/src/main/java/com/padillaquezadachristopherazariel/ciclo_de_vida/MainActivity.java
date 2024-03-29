package com.padillaquezadachristopherazariel.ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
// La actividad ya no es visible (ahora está "detenida")
    }


        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
// La actividad ya no es visible (ahora está "detenida")
        }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
// La actividad ya no es visible (ahora está "detenida")
    }


            @Override
            protected void onStop() {
                super.onStop();
                Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
// La actividad ya no es visible (ahora está "detenida")
            }


                @Override
                protected void onDestroy() {
                    super.onDestroy();
                    Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
// La actividad ya no es visible (ahora está "detenida")
                }
}