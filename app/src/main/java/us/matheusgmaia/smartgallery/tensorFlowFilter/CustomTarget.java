package us.matheusgmaia.smartgallery.tensorFlowFilter;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

public abstract class CustomTarget {

    public SimpleTarget<Bitmap> CustomTargetImpl() {
        return new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition){

            }
        };
    }
}
