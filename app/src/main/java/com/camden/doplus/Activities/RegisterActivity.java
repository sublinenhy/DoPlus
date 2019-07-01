package com.camden.doplus.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.camden.doplus.R;

public class RegisterActivity extends AppCompatActivity {

    private ImageView userImage;
    private EditText userName;
    private EditText userEmail;
    private EditText userPasswd;
    private EditText userPasswdConfirm;
    private static int PReqCode = 1;
    private static int REQUESTCODE = 1;
    private Uri pickedImgUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userImage = findViewById(R.id.iv_profile);

    }

    //点击用户头像从手机图库中选择照片
    //如果版本大于22则需要图库权限
    public void clickUserImageView(View view) {

        if(Build.VERSION.SDK_INT >= 22){

            checkAndRequestForPermission();

        }
        else{

            openGallery();

        }

    }

    private void openGallery() {

        Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryIntent.setType("image/*");
        startActivityForResult(galleryIntent, REQUESTCODE);

    }

    private void checkAndRequestForPermission() {

        if (ContextCompat.checkSelfPermission(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED){

            if (ActivityCompat.shouldShowRequestPermissionRationale(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)){

                Toast.makeText(RegisterActivity.this,"上传照片需要读取内置存储权限",Toast.LENGTH_SHORT).show();

            }
            else {

                ActivityCompat.requestPermissions(RegisterActivity.this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        PReqCode);

            }

        }
        else {

            openGallery();

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUESTCODE && data != null){

            //当用户成功选择了一张图片，我们需要将路径存在一个Uri对象里
            pickedImgUri = data.getData();
            userImage.setImageURI(pickedImgUri);

        }

    }

    //TODO 需要完成点击注册按钮完成注册
}
