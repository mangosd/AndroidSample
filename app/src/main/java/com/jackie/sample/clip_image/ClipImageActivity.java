package com.jackie.sample.clip_image;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.jackie.sample.R;
import com.jackie.sample.custom_view.ClipImageLayout;

/**
 * Created by Jackie on 2017/5/15.
 * 裁剪图片
 */

public class ClipImageActivity extends AppCompatActivity {
    private ClipImageLayout mClipImageLayout;
    private ImageView mClipImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_image);

        mClipImageLayout = (ClipImageLayout) findViewById(R.id.clip_image_layout);
        mClipImageView = (ImageView) findViewById(R.id.clip_image_view);
//        mClipImageLayout.setHorizontalPadding(30);
//        mClipImageLayout.setImageDrawable(getResources().getDrawable(R.drawable.yifei1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.clip_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_clip:
                Bitmap bitmap = mClipImageLayout.clip();

//                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
//                byte[] buffer = byteArrayOutputStream.toByteArray();
//
//                Intent intent = new Intent(this, ShowImageActivity.class);
//                /**
//                 * 如果传递的图片太大
//                 * android.os.TransactionTooLargeException: data parcel size 728504 bytes
//                 * 因此，不推荐在activity之间传递图片，可以将图片保存，然后传递图片的路径
//                 * http://blog.csdn.net/u010886101/article/details/54171845
//                 */
//
//                intent.putExtra("bitmap", buffer);
//                startActivity(intent);

                mClipImageLayout.setVisibility(View.GONE);
                mClipImageView.setVisibility(View.VISIBLE);
                mClipImageView.setImageBitmap(bitmap);

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
