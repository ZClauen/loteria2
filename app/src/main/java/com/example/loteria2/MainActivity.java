package com.example.loteria2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        switch (view.getId()) {

            case R.id.btncotorro:
                img=findViewById(R.id.btncotorro);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.cotorroenabled);
                break;
            case R.id.btnalacran:
                img=findViewById(R.id.btnalacran);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.alacranenabled);
                break;
            case R.id.btncazo:
                img=findViewById(R.id.btncazo);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.cazoenabled);
                break;
            case R.id.btncorona:
                img=findViewById(R.id.btncorona);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.coronaenabled);
                break;
            case R.id.btnestrella:
                img=findViewById(R.id.btnestrella);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.estrellaenabled);
                break;
            case R.id.btngallo:
                img=findViewById(R.id.btngallo);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.galloenabled);
                break;
            case R.id.btngarza:
                img=findViewById(R.id.btngarza);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.garzaenabled);
                break;
            case R.id.btnharp:
                img=findViewById(R.id.btnharp);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.harp_enabled);
                break;
            case R.id.btnmuerte:
                img=findViewById(R.id.btnmuerte);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.muerteenabled);
                break;
            case R.id.btnmusico:
                img=findViewById(R.id.btnmusico);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.musicoenabled);
                break;
            case R.id.btnpajaro:
                img=findViewById(R.id.btnpajaro);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.pajaro_enabled);
                break;
            case R.id.btnpalma:
                img=findViewById(R.id.btnpalma);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.palmaenabled);
                break;
            case R.id.btnparaguas:
                img=findViewById(R.id.btnparaguas);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.paraguasenabled);
                break;
            case R.id.btnpescado:
                img=findViewById(R.id.btnpescado);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.pescadoenabled);
                break;
            case R.id.btnspider:
                img=findViewById(R.id.btnspider);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.spiderenabled);
                break;
            case R.id.btntambor:
                img=findViewById(R.id.btntambor);
                img.setEnabled(false);
                img.setBackgroundResource(R.drawable.tambor);
                break;

        }

    }
}
