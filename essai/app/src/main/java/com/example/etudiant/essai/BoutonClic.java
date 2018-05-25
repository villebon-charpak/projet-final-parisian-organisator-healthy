package com.example.etudiant.essai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BoutonClic extends AppCompatActivity {

    private TextView points;
    private ImageView bouton;
    private int clicks = 0;     /** permet de mettre le compteur à 0 */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouton_clic);

        this.points = (TextView) findViewById(R.id.points);
        this.bouton = (ImageView) findViewById(R.id.bouton);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            clicks++;
            points.setText("points : " + clicks ); /** permet de relier l'image et le compteur. Le compteur va afficher le bon nombre de point */

            }
        });
    }
}
