# MyImageViewZoom
Use ImageViewZoom to make zoom in ImageView
This project use picasso to import pictures from internet
1-add:
compile 'it.sephiroth.android.library.imagezoom:imagezoom:1.0.5'
compile 'com.squareup.picasso:picasso:2.5.2'
to your build.gradle and rebuild your project.
2-import imageviewzoom module to your project
3-add:
<it.sephiroth.android.library.imagezoom.ImageViewTouch
        android:id="@+id/img_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
to your xml file where you want to add ImageViewZoom
4-add:
ImageViewTouch mImage;
.....
mImage=(ImageViewTouch)findViewById(R.id.img_image);
.....
Picasso.with(MainActivity.this)
                .load("image url")
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .fit()
                .into(mImage);
to your java file to show image and zoom it.

Enjoy Developping with simple trics from AymenSoft
WebSite: www.aymen-soft.com
Facebook:  https://www.facebook.com/AymenSoft
twitter: https://twitter.com/aymen_soft
GooglePlus: https://plus.google.com/+AymenSoftOfficial
Telegram: https://telegram.me/AymenSoftOfficial
