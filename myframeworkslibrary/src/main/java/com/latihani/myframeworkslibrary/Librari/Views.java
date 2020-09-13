package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.view.ContextThemeWrapper;

public class Views {

    Context context;

    public Views(Context context){

        this.context = context;

    }

    public Linear linearMatch2Vertical(View... view){

        Linear linearLayout = new Linear(context);
        linearLayout.ukuran(Ukuran.match_match()).orientasi(LinearLayout.VERTICAL
        ).warnaBG(Color.WHITE);

        if (view != null){
            for (int i = 0; i<view.length; i++){

                linearLayout.addView(view[i]);

            }
        }

        return linearLayout;

    }

    public Linear linearMatchWrapHorizontal(View... view){

        Linear linearLayout = new Linear(context);
        linearLayout.ukuran(Ukuran.match_wrap()).orientasi(LinearLayout.HORIZONTAL);

        if (view != null){
            for (int i = 0; i<view.length; i++){

                linearLayout.addView(view[i]);

            }
        }

        return linearLayout;

    }

    public Linear linearMatchWrapVertical(View... view){

        Linear linearLayout = new Linear(context);
        linearLayout.ukuran(Ukuran.match_wrap()).orientasi(LinearLayout.VERTICAL);

        if (view != null){
            for (int i = 0; i<view.length; i++){

                linearLayout.addView(view[i]);

            }
        }

        return linearLayout;

    }

    public Linear linearWrap2Horizontal(View... view){

        Linear linearLayout = new Linear(context);
        linearLayout.ukuran(Ukuran.wrap_wrap()).orientasi(LinearLayout.HORIZONTAL);

        if (view != null){
            for (int i = 0; i<view.length; i++){

                linearLayout.addView(view[i]);

            }
        }

        return linearLayout;

    }

    public Linear garis(int height, int warna){

        Linear linearLayout = new Linear(context);
        linearLayout.ukuran(Ukuran.custom(context, Ukuran.MATCH_PARENT, height, 0)).orientasi(LinearLayout.HORIZONTAL).warnaBG(warna);

        return linearLayout;

    }

    public MaterialRipple materialRippleWrap2(View view, int style){

        MaterialRipple materialRippleLayout = new MaterialRipple(new ContextThemeWrapper(context, style));
        materialRippleLayout.ukuran(Ukuran.wrap_wrap());

        if (view != null){
            materialRippleLayout.addView(view);
        }

        return materialRippleLayout;

    }

    public MaterialRipple materialRippleMatchWrap(View view, int style){

        MaterialRipple materialRippleLayout = new MaterialRipple(new ContextThemeWrapper(context, style));
        materialRippleLayout.ukuran(Ukuran.match_wrap());

        if (view != null){
            materialRippleLayout.addView(view);
        }

        return materialRippleLayout;

    }

    public TextV textMatchWrap(){

        TextV textV = new TextV(context);
        textV.ukuran(Ukuran.match_wrap());

        return textV;

    }

    public TextV textWrap2(){

        TextV textV = new TextV(context);
        textV.ukuran(Ukuran.wrap_wrap());

        return textV;

    }

    public ImageV imgWrap2(){

        ImageV imageV = new ImageV(context);
        imageV.ukuran(Ukuran.wrap_wrap());

        return imageV;

    }

    public ImageV img(int width, int height, float weight){

        ImageV imageV = new ImageV(context);
        imageV.ukuran(Ukuran.custom(context, width,height,weight));

        return imageV;

    }

    public EditTxt edMatchWrap(){

        EditTxt editTxt = new EditTxt(context);
        editTxt.ukuran(Ukuran.match_wrap());

        return editTxt;

    }

    public Btn btnMatchWrap(){

        Btn btn = new Btn(context);
        btn.ukuran(Ukuran.match_wrap());

        return btn;

    }

    public CardV cardMatchWrap(View view){

        CardV cardV = new CardV(context);
        cardV.ukuran(Ukuran.match_wrap());

        if (view != null){
            cardV.addView(view);
        }


        return cardV;

    }


}
