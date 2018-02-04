package com.example.muhammadfarhan.muhammadfarhan_1202144152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String ShowMenuMakanan = intent.getStringExtra("Menu");
        String ShowPorsiMakanan = intent.getStringExtra("Porsi");
        String NamaTempat = intent.getStringExtra("Tempat");
        String HargaMakanan = intent.getStringExtra("Harga");

        int total_harga = Integer.valueOf(ShowPorsiMakanan)*Integer.valueOf(HargaMakanan);

        TextView Menu = (TextView) findViewById(R.id.menu_makanan);
        TextView Porsi = (TextView)findViewById(R.id.porsi_makanan);
        TextView Tempat = (TextView) findViewById(R.id.tempat_show);
        TextView Harga = (TextView) findViewById(R.id.harga_show);

        Menu.setText(ShowMenuMakanan);
        Porsi.setText(ShowPorsiMakanan);
        Tempat.setText(NamaTempat);
        Harga.setText(String.valueOf(total_harga));

        if (total_harga > 65500) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
