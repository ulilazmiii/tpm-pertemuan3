package com.example.pahlawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IsiDeskripsi extends AppCompatActivity {

    ImageView itemhero_iv_gambar;
    TextView itemhero_tv_nama, itemhero_tv_deskripsi;
    String nama, detail;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deskripsi);
        itemhero_iv_gambar = findViewById(R.id.iv_gambar);
        itemhero_tv_nama = findViewById(R.id.tv_nama);
        itemhero_tv_deskripsi = findViewById(R.id.tv_deskripsi);

        nama = getIntent().getStringExtra("Nama");
        detail = getIntent().getStringExtra("Detail");
        image = getIntent().getIntExtra("Image", 0);
        itemhero_tv_nama.setText(nama);
        itemhero_tv_deskripsi.setText(detail);
        itemhero_iv_gambar.setImageResource(image);
    }
}
