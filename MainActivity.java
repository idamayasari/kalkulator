package id.idamysari.kalkulator;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonTambah, buttonKurang, buttonKali, buttonBagi;
    EditText angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);

        angka1 = (EditText)findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        hasil = (EditText) findViewById(R.id.hasil);
        buttonTambah.setOnClickListener(this);
        buttonKurang.setOnClickListener(this);
        buttonKali.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int bil1 = Integer.parseInt(angka1.getText().toString());
        int bil2 = Integer.parseInt(angka2.getText().toString());
        int result = 0;

        switch(view.getId()){
            case R.id.buttonTambah : result = bil1 + bil2; break;
            case R.id.buttonKurang : result = bil1 - bil2; break;
            case R.id.buttonKali : result = bil1 * bil2; break;
            case R.id.buttonBagi : result = bil1 / bil2; break;
        }

        hasil.setText(String.valueOf(result));
    }
}
