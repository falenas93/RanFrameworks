package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.widget.LinearLayout;

public class Linear extends LinearLayout {

    Context context;

    LayoutParams layoutParams;

    int kiri = 0, atas = 0, kanan = 0, bawah = 0;

    public Linear(Context context) {
        super(context);

        this.context = context;

    }

    public Linear warnaBG(int color){

        setBackgroundColor(color);

        return this;

    }

    public Linear ukuran (LayoutParams layoutParams){

        this.layoutParams = layoutParams;

        setLayoutParams(layoutParams);

        return this;

    }

    public Linear orientasi(int orientation){

        setOrientation(orientation);

        return this;

    }

    public Linear gravity(int gravity){

        setGravity(gravity);

        return this;


    }

    public Linear padding(float p){

        int i = Ukuran.dp(context, p);

        kiri = i;
        kanan = i;
        atas = i;
        bawah = i;

        setPadding(i, i, i, i);

        return this;

    }

    public Linear paddingKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        this.kiri = i;

        setPadding(i,atas,kanan,bawah);

        return this;

    }

    public Linear paddingKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        this.kanan = i;

        setPadding(kiri,atas,i,bawah);

        return this;

    }

    public Linear paddingAtas(float atas){

        int i = Ukuran.dp(context, atas);

        this.atas = i;

        setPadding(kiri,i,kanan,bawah);

        return this;

    }

    public Linear paddingBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        this.bawah = i;

        setPadding(kiri,atas,kanan,i);

        return this;

    }

    public Linear margin(float m){

        int i = Ukuran.dp(context, m);

        layoutParams.setMargins(i,i,i,i);

        return this;
    }

    public Linear marginKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        layoutParams.leftMargin = i;

        return this;
    }

    public Linear marginKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        layoutParams.rightMargin = i;

        return this;
    }
    
    public Linear marginAtas(float atas){

        int i = Ukuran.dp(context, atas);

        layoutParams.topMargin = i;

        return this;
    }

    public Linear marginBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        layoutParams.bottomMargin = i;

        return this;
    }

    public Linear weight(float weight){

        layoutParams.weight = weight;

        return this;

    }


}
