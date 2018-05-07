package com.example.etudiant.essai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Orga extends AppCompatActivity {

    private ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orga);
        this.play= (ImageView) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), BoutonClic.class);/** permet de démarrer des action et créer des instructions */
                startActivity(otheractivity);
                finish(); /** tout cela permet de créer une image bouton, qui va nous permettre de passer au bouton clic ou au calendrier */

            }
        });
    }
}
