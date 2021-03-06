package com.huami.watch.train.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by jinliang on 16/11/16.
 */

public class DrawableCenterTextView extends TextView {

    public DrawableCenterTextView(Context context) {
        super(context);
    }

    public DrawableCenterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawableCenterTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable[] drawables = getCompoundDrawables();
         if (drawables != null) {
             Drawable drawableLeft = drawables[0];
             if (drawableLeft != null) {
                 float textWidth = getPaint().measureText(getText().toString());
                 int drawablePadding = getCompoundDrawablePadding();
                 int drawableWidth = 0;
                 drawableWidth = drawableLeft.getIntrinsicWidth();
                float bodyWidth = textWidth + drawableWidth + drawablePadding;
                 canvas.translate((getWidth() - bodyWidth) / 2, 0);
             }
         }
        super.onDraw(canvas);

    }
}
