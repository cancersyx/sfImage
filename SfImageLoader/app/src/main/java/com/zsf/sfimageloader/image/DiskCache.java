package com.zsf.sfimageloader.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author EWorld
 *         2018/1/23 22:14
 * @e-mail 852333743@qq.com
 * @description 下载过的图片缓存到本地
 */

public class DiskCache {
    static String cacheDir = "sdcard/cache";

    /**
     * 从缓存中获取图片
     *
     * @param url
     * @return
     */
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    /**
     * 将图片缓存到内存中
     *
     * @param url
     * @param bitmap
     */
    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
