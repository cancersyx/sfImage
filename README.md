# sfImage
图片加载--《Android源码设计模式》记录

version 0.1 实现图片加载
主要是ImageLoader类。
实现方式：
在Activity中使用下面的方式即可。

```
 new ImageLoader().displayImage(url, mDisplayImg);
```

version 0.2 采用单一职责，将ImageLoader类解耦及增强扩展性
增加ImageCache.class,负责处理将图片缓存到内存中；
ImageLoader主要负责download图片和display图片。
使用方式不变。

增加DiskCache.class来实现SD存储
