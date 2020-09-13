package com.latihani.myframeworkslibrary.Login;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.latihani.myframeworkslibrary.Librari.CardV;
import com.latihani.myframeworkslibrary.Librari.EditTxt;
import com.latihani.myframeworkslibrary.Librari.ImageV;
import com.latihani.myframeworkslibrary.Librari.Linear;
import com.latihani.myframeworkslibrary.Librari.TextV;
import com.latihani.myframeworkslibrary.Librari.Views;
import com.latihani.myframeworkslibrary.R;


public class LoginInstagram {

    Context context;

    Views v;
    public TextV txtBahasa, btnLogin, txtLupaPass1, txtLupaPass2, txtOR, txtLogFB, txtNoAkun, txtDaftar;
    public ImageV icBahasa, icLogo, icFB;
    public EditTxt edUsername, edPassword;
    public Linear bahasaKlik, logFBKlik;

    public LoginInstagram(Context context) {

        v = new Views(context);

        this.context = context;

    }

    public Linear view(){

        Linear linear = kanvas(

                header("English (United Kingdom)", R.mipmap.ic_launcher), //bahasa
                body(

                        logo(R.mipmap.ic_launcher),
                        inputUsername("Phone number, email or username"),
                        inputPassword("Password"),
                        btnLogin("Log In"),
                        lupaPassword(R.mipmap.ic_launcher, "Forgot your login details?", "Get help signing in.", "OR", "Log in with Facebook")

                ),
                footer("Don't have an account?", "Sign up.")

        );

        return linear;

    }

    //------------------------------------------------------------------------------------------------------------------

    private Linear kanvas(View... view){

        Linear linearLayout = v.linearMatch2Vertical(null).warnaBG(Color.WHITE);

        for (int i = 0; i<view.length; i++){

            linearLayout.addView(view[i]);

        }

        linearLayout.padding(20);

        return linearLayout;

    }

    private Linear header(String teks, int icon){


        txtBahasa = v.textWrap2();
        icBahasa = v.img(20,20,0);
        bahasaKlik = v.linearWrap2Horizontal(

                txtBahasa.teks(teks), icBahasa.gambar(icon).marginKiri(5)

        ).padding(5).gravity(Gravity.CENTER);

        Linear linearLayout = v.linearMatchWrapHorizontal(
                v.materialRippleWrap2(

                        bahasaKlik

                , R.style.RippleStyleBlack)
        ).gravity(Gravity.CENTER_HORIZONTAL);

        return linearLayout;

    }

    private Linear body(View... views){

        Linear linearLayout = v.linearMatch2Vertical(null).weight(1).gravity(Gravity.CENTER);

        for (int i = 0; i<views.length; i++){

            linearLayout.addView(views[i]);

        }

        return linearLayout;


    }

    private ImageV logo(int gambar){

         icLogo = v.imgWrap2().gambar(gambar);
         icLogo.setAdjustViewBounds(true);
         icLogo.setScaleType(ImageView.ScaleType.FIT_CENTER);

         return icLogo;

    }

    private EditTxt inputUsername(String hint){

        edUsername = v.edMatchWrap().hint(hint).appearance(android.R.style.TextAppearance_Small).marginAtas(30);
        edUsername.setSingleLine(true);

        return edUsername;

    }

    private EditTxt inputPassword(String hint){

        edPassword = v.edMatchWrap().hint(hint).appearance(android.R.style.TextAppearance_Small).marginAtas(10);
        edPassword.setSingleLine(true);

        return edPassword;

    }

    private CardV btnLogin(String teks){

        btnLogin = v.textMatchWrap().teks(teks).gravity(Gravity.CENTER)
                .warnaTeks(Color.WHITE).warnaBG(context.getResources().getColor(R.color.colorPrimary)).padding(15);

        CardV cardV = v.cardMatchWrap(

                v.materialRippleMatchWrap(

                        btnLogin


                , R.style.RippleStyleWhite)

        ).marginAtas(10).radius(5);


        return cardV;

    }

    private Linear lupaPassword(int icon, String... teks){

            txtLupaPass1 = v.textWrap2().teks(teks[0]);
            txtLupaPass2 = v.textWrap2().teks(teks[1]).style(Typeface.BOLD);
            txtOR = v.textWrap2().teks(teks[2]).marginKiri(5).marginKanan(5).appearance(android.R.style.TextAppearance_Medium).warnaTeks(Color.GRAY).style(Typeface.BOLD);
            txtLogFB = v.textWrap2().teks(teks[3]).marginKiri(5).appearance(android.R.style.TextAppearance_Medium).warnaTeks(context.getResources().getColor(R.color.colorPrimary)).style(Typeface.BOLD);
            icFB = v.img(24,24,0).gambar(icon);
            logFBKlik = v.linearWrap2Horizontal(

                    icFB,
                    txtLogFB

            ).gravity(Gravity.CENTER).padding(5);

            Linear linear = v.linearMatchWrapVertical(

                    v.linearWrap2Horizontal(

                            txtLupaPass1,
                            v.materialRippleWrap2(

                                    txtLupaPass2

                            , R.style.RippleStyleBlack).marginKiri(5)

                    ),

                    v.linearMatchWrapHorizontal(

                            v.garis(1, Color.GRAY).weight(1),
                            txtOR,
                            v.garis(1, Color.GRAY).weight(1)

                    ).marginAtas(15).gravity(Gravity.CENTER),

                    v.materialRippleWrap2(

                            logFBKlik


                    , R.style.RippleStyleBlack).marginAtas(15)


            ).gravity(Gravity.CENTER).marginAtas(10);

            return linear;

    }

    private Linear footer(String... teks){

        txtNoAkun = v.textWrap2().teks(teks[0]);
        txtDaftar = v.textWrap2().teks(teks[1]).style(Typeface.BOLD);

        Linear linear = v.linearMatchWrapVertical(

                v.garis(1, Color.GRAY),
                v.linearWrap2Horizontal(
                        txtNoAkun,
                        v.materialRippleWrap2(

                                txtDaftar

                                ,R.style.RippleStyleBlack).marginKiri(5)
                ).marginAtas(10)

        ).gravity(Gravity.CENTER);

        return linear;

    }


    //---------------------------------------------------------------------------------------

//    public TextV txtBahasa(){
//
//        return txtBahasa;
//
//    }
//
//    public ImageV icBahasa(){
//
//        return icBahasa;
//
//    }
//
//    public ImageV icLogo(){
//
//        return icLogo;
//
//    }
//
//    public EditTxt edUsername(){
//
//        return edUsername;
//    }
//
//    public EditTxt edPassword(){
//
//        return edPassword;
//    }
//
//    public TextV btnLogin(){
//
//        return btnLogin;
//
//    }
//
//    public TextV txtLupaPass1(){
//
//        return txtLupaPass1;
//
//    }
//
//    public TextV txtLupaPass2(){
//
//        return txtLupaPass2;
//
//    }
//
//    public TextV txtOR(){
//
//        return txtOR;
//
//    }
//
//    public ImageV icFB(){
//
//        return icFB;
//
//    }
//
//    public TextV txtLogFB(){
//
//        return txtLogFB;
//
//    }
//
//    public TextV txtNoAkun(){
//
//        return txtNoAkun;
//
//    }
//
//    public TextV txtDaftar(){
//
//        return txtDaftar;
//
//    }
//
//    public Linear bahasaKlik(){
//
//        return bahasaKlik;
//
//    }
//
//    public Linear logFBKlik(){
//
//        return logFBKlik;
//
//    }


}
