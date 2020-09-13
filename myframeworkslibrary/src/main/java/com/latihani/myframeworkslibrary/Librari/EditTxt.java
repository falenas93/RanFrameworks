package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.os.Build;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatEditText;

public class EditTxt extends AppCompatEditText {

    Context context;

    LinearLayout.LayoutParams layoutParams;

    int kiri = 0, atas = 0, kanan = 0, bawah = 0;

    public EditTxt(Context context) {
        super(context);

        this.context = context;

    }

    public EditTxt warnaBG(int color){

        setBackgroundColor(color);

        return this;

    }
    
    public EditTxt BG(int drawable){

        setBackgroundResource(drawable);

        return this;

    }

    public EditTxt ukuran(LinearLayout.LayoutParams layoutParams){

        this.layoutParams = layoutParams;

        setLayoutParams(layoutParams);

        return this;
    }

    public EditTxt teks(String teks){

        setText(teks);

        return this;

    }
    
    public EditTxt hint(String hint){

        setHint(hint);

        return this;

    }


    public EditTxt gravity(int gravity){

        setGravity(gravity);

        return this;


    }

    public EditTxt padding(float p){

        int i = Ukuran.dp(context, p);

        kiri = i;
        kanan = i;
        atas = i;
        bawah = i;

        setPadding(i, i, i, i);

        return this;

    }

    public EditTxt paddingKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        this.kiri = i;

        setPadding(i,atas,kanan,bawah);

        return this;

    }

    public EditTxt paddingKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        this.kanan = i;

        setPadding(kiri,atas,i,bawah);

        return this;

    }

    public EditTxt paddingAtas(float atas){

        int i = Ukuran.dp(context, atas);

        this.atas = i;

        setPadding(kiri,i,kanan,bawah);

        return this;

    }

    public EditTxt paddingBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        this.bawah = i;

        setPadding(kiri,atas,kanan,i);

        return this;

    }

    public EditTxt margin(float m){

        int i = Ukuran.dp(context, m);

        layoutParams.setMargins(i,i,i,i);

        return this;
    }

    public EditTxt marginKiri(float kiri){

        int i = Ukuran.dp(context, kiri);

        layoutParams.leftMargin = i;

        return this;
    }

    public EditTxt marginKanan(float kanan){

        int i = Ukuran.dp(context, kanan);

        layoutParams.rightMargin = i;

        return this;
    }

    public EditTxt marginAtas(float atas){

        int i = Ukuran.dp(context, atas);

        layoutParams.topMargin = i;

        return this;
    }

    public EditTxt marginBawah(float bawah){

        int i = Ukuran.dp(context, bawah);

        layoutParams.bottomMargin = i;

        return this;
    }

    public EditTxt weight(float weight){

        layoutParams.weight = weight;

        return this;

    }

    public EditTxt style(int style){

        setTypeface(getTypeface(), style);

        return this;

    }

    public EditTxt appearance(int appearance){

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            setTextAppearance(context, appearance);
        } else {
            setTextAppearance(appearance);
        }

        return this;

    }


}
