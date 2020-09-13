package com.latihani.myframeworkslibrary.Librari;

import android.content.Context;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Ukuran {

    public static int MATCH_PARENT = LinearLayout.LayoutParams.MATCH_PARENT;
    public static int WRAP_CONTENT = LinearLayout.LayoutParams.WRAP_CONTENT;

    public static LinearLayout.LayoutParams match_match(){

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);


        return layoutParams;

    }

    public static LinearLayout.LayoutParams match_wrap(){

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        return layoutParams;


    }

    public static LinearLayout.LayoutParams wrap_match(){

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        return layoutParams;
    }

    public static LinearLayout.LayoutParams wrap_wrap(){

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        return layoutParams;
    }

    public static LinearLayout.LayoutParams custom(Context context, int width, int height, float weight){

        int iwitdh = width, iheight = height;

        if (width != WRAP_CONTENT & width != MATCH_PARENT){

            iwitdh = Ukuran.dp(context, width);

        }

        if (height != WRAP_CONTENT & height != MATCH_PARENT){

            iheight = Ukuran.dp(context, height);

        }

        Log.i("cekukuran", "widht => "+width+",\theight => "+height+",\tmatch_parent => "+MATCH_PARENT);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iwitdh,
                iheight, weight);

        return layoutParams;
    }

    public static int dp(Context context, float dp){
        int i = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());

        return i;

    }


}
