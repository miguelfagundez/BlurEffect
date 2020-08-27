# BlurEffect
BlurEffect using a third library

**For more details:** https://github.com/jgabrielfreitas/BlurImageView

## Include in Build.Gradle (Project):

```
   allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

## Include in Build.Gradle (Module:app):

```
    // Blur Library
    implementation 'com.github.jgabrielfreitas:BlurImageView:1.0.1'
```


## Layout file (main_activity.xml):

```
        <com.jgabrielfreitas.core.BlurImageView
          android:id="@+id/ivBlurImage2"
          android:layout_width="240dp"
          android:layout_height="160dp"
          .../>
```

## Code (.java):

```
    // View
    private BlurImageView blurImageView;
    // FindViewById method
    blurImageView = (BlurImageView) findViewById(R.id.ivBlurImage);
    // Include a integer value
    blurImageView.setBlur(4);
```

## Final result:
<p align = "center">
<img src="/images/01.png" width="300">
</p>
