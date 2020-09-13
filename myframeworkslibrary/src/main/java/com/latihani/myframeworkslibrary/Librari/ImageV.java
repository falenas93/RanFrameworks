package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatImageView;

public class ImageV extends AppCompatImageView {

    Context context;

    LinearLayout.LayoutParams layoutParams;

    int kiri = 0, atas = 0, kanan = 0, bawah = 0;

    public ImageV(Context context) {
        super(context);

        this.context = context;

    }

    public ImageV warnaBG(int color){

        setBackgroundColor(color);

        return this;

    }

    public ImageV ukuran(LinearLayout.LayoutParams layoutParams){

        this.layoutParams = layoutParams;

        setLayoutParams(layoutParams);

        return this;
    }

    public ImageV gambar(int gambar){

        setImageResource(gambar);

        return this;

    }

    public ImageV padding(float p){

        int i = Ukuran.dp(context, p);

        kiri = i;
        kanan = i;
        atas = i;
        bawah = i;

        setPadding(i, i, i, i);

        return this;

    }

    public ImageV paddingKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        this.kiri = i;

        setPadding(i,atas,kanan,bawah);

        return this;

    }

    public ImageV paddingKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        this.kanan = i;

        setPadding(kiri,atas,i,bawah);

        return this;

    }

    public ImageV paddingAtas(float atas){

        int i = Ukuran.dp(context, atas);

        this.atas = i;

        setPadding(kiri,i,kanan,bawah);

        return this;

    }

    public ImageV paddingBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        this.bawah = i;

        setPadding(kiri,atas,kanan,i);

        return this;

    }

    public ImageV margin(float m){

        int i = Ukuran.dp(context, m);

        layoutParams.setMargins(i,i,i,i);

        return this;
    }

    public ImageV marginKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        layoutParams.leftMargin = i;

        return this;
    }

    public ImageV marginKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        layoutParams.rightMargin = i;

        return this;
    }

    public ImageV marginAtas(float atas){

        int i = Ukuran.dp(context, atas);

        layoutParams.topMargin = i;

        return this;
    }

    public ImageV marginBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        layoutParams.bottomMargin = i;

        return this;
    }


    public ImageV weight(float weight){

        layoutParams.weight = weight;

        return this;

    }



}
