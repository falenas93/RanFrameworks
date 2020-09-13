package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;

public class CardV extends CardView {

    Context context;

    int kiri = 0, atas = 0, kanan = 0, bawah = 0;

    LinearLayout.LayoutParams layoutParams;

    public CardV(Context context) {
        super(context);

        this.context = context;

    }


    public CardV ukuran(LinearLayout.LayoutParams layoutParams){

        this.layoutParams = layoutParams;

        setLayoutParams(layoutParams);

        return this;

    }

    public CardV padding(float p){

        int i = Ukuran.dp(context, p);

        kiri = i;
        kanan = i;
        atas = i;
        bawah = i;

        setPadding(i, i, i, i);

        return this;

    }

    public CardV paddingKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        this.kiri = i;

        setPadding(i,atas,kanan,bawah);

        return this;

    }

    public CardV paddingKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        this.kanan = i;

        setPadding(kiri,atas,i,bawah);

        return this;

    }

    public CardV paddingAtas(float atas){

        int i = Ukuran.dp(context, atas);

        this.atas = i;

        setPadding(kiri,i,kanan,bawah);

        return this;

    }

    public CardV paddingBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        this.bawah = i;

        setPadding(kiri,atas,kanan,i);

        return this;

    }

    public CardV margin(float m){

        int i = Ukuran.dp(context, m);

        layoutParams.setMargins(i,i,i,i);

        return this;
    }

    public CardV marginKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        layoutParams.leftMargin = i;

        return this;
    }

    public CardV marginKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        layoutParams.rightMargin = i;

        return this;
    }

    public CardV marginAtas(float atas){

        int i = Ukuran.dp(context, atas);

        layoutParams.topMargin = i;

        return this;
    }

    public CardV marginBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        layoutParams.bottomMargin = i;

        return this;
    }

    public CardV weight(float weight){

        layoutParams.weight = weight;

        return this;

    }

    public CardV radius(float radius){

        setRadius(Ukuran.dp(context, radius));

        return this;
    }

}
