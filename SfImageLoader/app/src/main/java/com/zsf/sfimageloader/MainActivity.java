package com.zsf.sfimageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zsf.sfimageloader.image.ImageLoader;

public class MainActivity extends AppCompatActivity {

    private ImageView mDisplayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplayImg = (ImageView) findViewById(R.id.iv_display);

        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516724988247&di=1eb0ef26e753b12b21a84dc520d810b5&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201411%2F09%2F20141109225823_U4kEe.jpeg";
        ImageLoader loader = new ImageLoader();
        //使用SD缓存
        loader.useDiskCache(true);
        loader.displayImage(url, mDisplayImg);
    }
}
