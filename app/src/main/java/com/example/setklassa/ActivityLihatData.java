package com.example.setklassa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Inayah":
                tvnama.setText("Inayah N");
                tvnomor.setText("12345678");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("23456781");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("34567812");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("456789123");
                break;
            case "Maul":
                tvnama.setText("maul M");
                tvnomor.setText("567891234");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("678912345");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("78123456");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("81234567");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("12345678");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("12345679");
                break;
        }
    }
}