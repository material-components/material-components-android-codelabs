package com.google.codelabs.mdc.java.shrine;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Custom item decoration for a vertical {@link ProductGridFragment} {@link RecyclerView}. Adds a
 * small amount of padding to the left of grid items, and a large amount of padding to the right.
 */
public class ProductGridItemDecoration extends RecyclerView.ItemDecoration {
    private int largePadding;
    private int smallPadding;

    public ProductGridItemDecoration(int largePadding, int smallPadding) {
        this.largePadding = largePadding;
        this.smallPadding = smallPadding;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.left = smallPadding;
        outRect.right = smallPadding;
        outRect.top = largePadding;
        outRect.bottom = largePadding;
    }
}
