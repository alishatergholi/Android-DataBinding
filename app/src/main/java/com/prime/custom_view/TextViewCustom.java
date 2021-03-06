package com.prime.custom_view;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.prime.utils.PublicFunction;

import java.io.FileNotFoundException;


/**
 * Created by alishatergholi on 11/7/16.
 */
public class TextViewCustom extends AppCompatTextView {

    final String TAG = TextViewCustom.class.getSimpleName();

    public TextViewCustom(Context context) {
        super(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TextViewCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        try {
            if (isInEditMode())
                PublicFunction.getTypeFace(context);
        } catch (FileNotFoundException e) {
            PublicFunction.LogData(false,TAG,e.getMessage());
        }
    }
}
