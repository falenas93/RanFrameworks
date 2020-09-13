package com.latihani.myframework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


import com.latihani.myframeworkslibrary.Librari.Ukuran;
import com.latihani.myframeworkslibrary.Login.LoginInstagram;

import static com.latihani.myframeworkslibrary.Librari.Ukuran.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginInstagram ig = new LoginInstagram(this);
        setContentView(ig.view());

        ig.txtBahasa.teks("Indonesia");
        ig.icLogo.gambar(R.drawable.ig_logo).ukuran(Ukuran.custom(this, WRAP_CONTENT, 60,0));
        ig.edUsername.hint("Nama User");
        ig.edPassword.hint("Kata Sandi");
        ig.btnLogin.teks("Masuk").warnaBG(Color.parseColor("#c3e0fa")).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ig.txtLupaPass1.teks("Lupa kata sandi?");
        ig.txtLupaPass2.teks("Bantuan");
        ig.txtOR.teks("ATAU");
        ig.txtLogFB.teks("Masuk dengan Facebook").warnaTeks(Color.parseColor("#3897f0"));
        ig.txtNoAkun.teks("Tidak punya akun?");
        ig.txtDaftar.teks("Daftar");

        ig.bahasaKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ig.logFBKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
