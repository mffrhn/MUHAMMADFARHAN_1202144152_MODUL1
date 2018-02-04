package com.example.muhammadfarhan.muhammadfarhan_1202144152_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText mMenuMakanan,mPorsiMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuMakanan = (EditText) findViewById(R.id.menu_makanan);
        mPorsiMakanan = (EditText) findViewById(R.id.porsi_makanan);
    }

    public void launchEatbus(View view) {
        Intent intent = new Intent (this, SecondActivity.class);

        String MenuMakanan = mMenuMakanan.getText().toString();
        String PorsiMakanan = mPorsiMakanan.getText().toString();

        intent.putExtra("Harga", "50000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Eatbus");

        startActivity(intent);
    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String MenuMakanan = mMenuMakanan.getText().toString();
        String PorsiMakanan = mPorsiMakanan.getText().toString();

        intent.putExtra("Harga", "30000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Abnormal");

        startActivity(intent);
    }
}
