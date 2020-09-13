package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.os.Build;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatTextView;

public class TextV extends AppCompatTextView {

    Context context;

    LinearLayout.LayoutParams layoutParams;

    int kiri = 0, atas = 0, kanan = 0, bawah = 0;

    public TextV(Context context) {
        super(context);

        this.context = context;


    }

    public TextV warnaBG(int color){

        setBackgroundColor(color);

        return this;

    }

    public TextV ukuran(LinearLayout.LayoutParams layoutParams){

        this.layoutParams = layoutParams;

        setLayoutParams(layoutParams);

        return this;
    }

    public TextV teks(String teks){

        setText(teks);

        return this;

    }


    public TextV gravity(int gravity){

        setGravity(gravity);

        return this;


    }

    public TextV padding(float p){

        int i = Ukuran.dp(context, p);

        kiri = i;
        kanan = i;
        atas = i;
        bawah = i;

        setPadding(i, i, i, i);

        return this;

    }

    public TextV paddingKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        this.kiri = i;

        setPadding(i,atas,kanan,bawah);

        return this;

    }

    public TextV paddingKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        this.kanan = i;

        setPadding(kiri,atas,i,bawah);

        return this;

    }

    public TextV paddingAtas(float atas){

        int i = Ukuran.dp(context, atas);

        this.atas = i;

        setPadding(kiri,i,kanan,bawah);

        return this;

    }

    public TextV paddingBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        this.bawah = i;

        setPadding(kiri,atas,kanan,i);

        return this;

    }

    public TextV margin(float m){

        int i = Ukuran.dp(context, m);

        layoutParams.setMargins(i,i,i,i);

        return this;
    }

    public TextV marginKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        layoutParams.leftMargin = i;

        return this;
    }

    public TextV marginKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        layoutParams.rightMargin = i;

        return this;
    }

    public TextV marginAtas(float atas){

        int i = Ukuran.dp(context, atas);

        layoutParams.topMargin = i;

        return this;
    }

    public TextV marginBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        layoutParams.bottomMargin = i;

        return this;
    }

    public TextV weight(float weight){

        layoutParams.weight = weight;

        return this;

    }

    public TextV style(int style){

        setTypeface(getTypeface(), style);

        return this;

    }

    public TextV appearance(int appearance){

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            setTextAppearance(context, appearance);
        } else {
            setTextAppearance(appearance);
        }

        return this;

    }

    public TextV warnaTeks(int color){

        setTextColor(color);

        return this;

    }


}
