package com.example.anan.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imgMoeda;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        imgMoeda = findViewById(R.id.imgMoeda);
        btnVoltar = findViewById(R.id.btnVoltar);
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String opcao = extra.getString("opcao");
            if(opcao.equals("cara")){
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                imgMoeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalheActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
