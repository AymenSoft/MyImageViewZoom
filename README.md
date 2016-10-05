<p># MyImageViewZoom<br>
Use ImageViewZoom to make zoom in ImageView<br>
This project use picasso to import pictures from internet<br>
1-add:<br>
compile 'it.sephiroth.android.library.imagezoom:imagezoom:1.0.5'<br>
compile 'com.squareup.picasso:picasso:2.5.2'<br>
to your build.gradle and rebuild your project.<br>
2-import imageviewzoom module to your project<br>
3-add:<br>
&lt;it.sephiroth.android.library.imagezoom.ImageViewTouch<br>
android:id=&quot;@+id/img_image&quot;<br>
android:layout_width=&quot;match_parent&quot;<br>
android:layout_height=&quot;match_parent&quot; /&gt;<br>
to your xml file where you want to add ImageViewZoom<br>
4-add:<br>
ImageViewTouch mImage;<br>
.....<br>
mImage=(ImageViewTouch)findViewById(R.id.img_image);<br>
.....<br>
Picasso.with(MainActivity.this)<br>
.load(&quot;image url&quot;)<br>
.memoryPolicy(MemoryPolicy.NO_CACHE)<br>
.networkPolicy(NetworkPolicy.NO_CACHE)<br>
.fit()<br>
.into(mImage);<br>
to your java file to show image and zoom it.<br>
<br>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
&nbsp;</p>
