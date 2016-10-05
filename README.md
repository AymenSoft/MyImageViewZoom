<p># MyImageViewZoom<br>
Use ImageViewZoom to make zoom in ImageView<br>
This project use picasso to import pictures from internet<br>
1-add:<br>
compile 'it.sephiroth.android.library.imagezoom:imagezoom:1.0.5'<br>
compile 'com.squareup.picasso:picasso:2.5.2'<br>
to your build.gradle and rebuild your project.<br>
2-import imageviewzoom module to your project<br>
3-add:<br>
&nbsp;</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#e8bf6a;">&lt;it.sephiroth.android.library.imagezoom.ImageViewTouch
    </span><span style="color:#9876aa;">android</span><span style="color:#bababa;">:id=</span><span style="color:#6a8759;">&quot;@+id/img_image&quot;
    </span><span style="color:#9876aa;">android</span><span style="color:#bababa;">:layout_width=</span><span style="color:#6a8759;">&quot;match_parent&quot;
    </span><span style="color:#9876aa;">android</span><span style="color:#bababa;">:layout_height=</span><span style="color:#6a8759;">&quot;match_parent&quot; </span><span style="color:#e8bf6a;">/&gt;</span></pre>
<p><br>
to your xml file where you want to add ImageViewZoom<br>
4-add:</p>
<p><br>
&nbsp;</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;">	ImageViewTouch <span style="color:#9876aa;">mImage</span><span style="color:#cc7832;">;


    </span><span style="color:#9876aa;">mImage</span>=(ImageViewTouch)findViewById(R.id.<span style="color:#9876aa;font-style:italic;">img_image</span>)<span style="color:#cc7832;">;
    </span>Picasso.<span style="font-style:italic;">with</span>(MainActivity.<span style="color:#cc7832;">this</span>)
            .load(<span style="color:#6a8759;">&quot;picture url&quot;</span>)
            .memoryPolicy(<span style="background-color:#344134;">MemoryPolicy</span>.<span style="color:#9876aa;font-style:italic;">NO_CACHE</span>)
            .networkPolicy(NetworkPolicy.<span style="color:#9876aa;font-style:italic;">NO_CACHE</span>)
            .fit()
            .into(<span style="color:#9876aa;">mImage</span>)<span style="color:#cc7832;">;</span></pre>
<p><br>
to your java file to show image and zoom it.</p>
<p>Result:</p>
<p><img border="0" src="http://img4.hostingpics.net/pics/258767121.png"><img border="0" src="http://img4.hostingpics.net/pics/956153762.png"><br>
<br>
<br>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
&nbsp;</p>
