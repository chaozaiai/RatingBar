# RatingBar
##android中一个评分的控件
![image](https://github.com/hedge-hog/RatingBar/blob/master/ic_demo.png)
# 如何使用
###Android Studio下：
```
    dependencies {
        compile 'com.hedgehog.ratingbar:app:1.1.0'
    }
```
###1，在XML中
```
   <com.hedgehog.ratingbar.RatingBar
        android:id="@+id/ratingbar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_gravity="center"
        android:layout_marginTop="50dp"
        hedgehog:clickable="true"
        hedgehog:halfstart="true"
        hedgehog:starCount="5"
        hedgehog:starEmpty="@mipmap/star_empty"
        hedgehog:starFill="@mipmap/star_full"
        hedgehog:starHalf="@mipmap/star_half"
        hedgehog:starImageHeight="90dp"
        hedgehog:starImageWidth="70dp"
        hedgehog:starImagePadding="20dp"/>

```

###方法说明
| 方法      |    用途 |
| :-------- | :--------:|
|hedgehog:clickable="true"   |是否可点击|
|hedgehog:halfstart="true"|是否支持半颗星|
|hedgehog:starCount="N"|星星的总数量N（int类型）|
|hedgehog:starEmpty="@mipmap/star_empty"|空星星的drawable|
|hedgehog:starFill="@mipmap/star_full"|填充的drawable|
|hedgehog:starHalf="@mipmap/star_half"|半颗星星的drawable|
|hedgehog:starImageHeight="90dp"|N颗星星的高度|
|hedgehog:starImageWidth="70dp"|N颗星星的宽度|
|hedgehog:starImagePadding="20dp"|星星之间的间距|
###注意：别忘了命名空间
```
xmlns:hedgehog="http://schemas.android.com/apk/res-auto"
```
###2，在java代码中
```
RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingbar);
mRatingBar.setStarEmptyDrawable(getResources().getDrawable(R.mipmap.star_empty));
mRatingBar.setStarHalfDrawable(getResources().getDrawable(R.mipmap.star_half));
mRatingBar.setStarFillDrawable(getResources().getDrawable(R.mipmap.star_full));
mRatingBar.setStarCount(5);
mRatingBar.setStar(2.5f);
mRatingBar.halfStar(true);
mRatingBar.setmClickable(true);
mRatingBar.setStarImageWidth(120f);
mRatingBar.setStarImageHeight(60f);
mRatingBar.setImagePadding(35);
mRatingBar.setOnRatingChangeListener(
    new RatingBar.OnRatingChangeListener() {
        @Override
        public void onRatingChange(float RatingCount) {
            Toast.makeText(MainActivity.this, "the fill star is" + RatingCount, Toast.LENGTH_SHORT).show();
                }
            }
        );

```

###方法说明
| 方法      |    用途 |
| :-------- | :--------:|
|mRatingBar.setStarCount(5);|星星的总数|
|mRatingBar.setStar(2.5f);|填充星星的总数|
|mRatingBar.halfStar(true);|是否设置半颗星|
|mRatingBar.setmClickable(true);|是否设置可被点击|
|mRatingBar.setStarImageWidth(120f);|N颗星星的宽度|
|mRatingBar.setStarImageHeight(60f);|N颗星星的高度|
|mRatingBar.setImagePadding(35);|星星之间的间距|


###关于
因为项目中需要这个功能，但android本身对Ratingbar的扩展支持的很不好，所以打算自己写一个，能力有限，很多功能不完善，如果你有更好的解决方案，欢迎告诉我，谢谢！

###未解决的
- **半颗星星的功能目前不是很好，不建议使用，具体的可以去看看代码。我这么写出来，只是做一个参考**
- **星星之间的间距可以设置，不过由于是重写的Imageview，所以间距的设置还需要自己微调。**

###感谢
感谢[Android_custom_ratingbarview][1]
感谢[lingguohui][2]

[1]:https://github.com/JackWong025/Android_custom_ratingbarview
[2]:https://github.com/lingguohui