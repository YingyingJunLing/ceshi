package com.example.baijunling0329.model;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import com.bumptech.glide.module.AppGlideModule;


@GlideModule
public class app extends AppGlideModule {

    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        super.applyOptions(context, builder);
        String path = getStorageDirectory() + "/clidCache";
        int diskCacheSizeBytes = 1024 * 1024 * 100;
        builder.setDiskCache(new DiskLruCacheFactory(path, diskCacheSizeBytes));
    }

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(context, glide, registry);
        Log.e("tag", "registerComponents");
    }


        String sdRootPath = Environment.getExternalStorageDirectory().getPath();
        String appRootPath = null;
        private String getStorageDirectory () {
            return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) ? sdRootPath : appRootPath;


    }

}