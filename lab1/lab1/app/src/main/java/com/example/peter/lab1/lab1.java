package com.example.peter.lab1;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.annotation.IdRes;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.peter.lab1.R.id.button;

public class lab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        Button button1 = (Button) findViewById(button);
        //TextInputLayout sno = (TextInputLayout) findViewById(R.id.sno);
        //TextInputLayout pwd = (TextInputLayout) findViewById(R.id.pwd);
        //EditText snoedit = sno.getEditText();
        //EditText pwdedit = pwd.getEditText();
    }
    //button.setOnClickListener()

    public void clicktp(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(lab1.this);
        builder.setTitle("上传头像");
        //LayoutInflater inflater = getLayoutInflater();
        //final View layout = inflater.inflate(R.layout.dialog, null);//获取自定义布局
        //builder.setView(layout);
        builder.setPositiveButton("拍摄", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(lab1.this, "拍你妈卖批，去吃瓜瓜", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("从相册选择", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(lab1.this, "选你妈卖批，去摘秧秧" , Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("取消", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(lab1.this, "这还差不多" , Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void clickxs(View v){
        Snackbar.make(v,"您选择了学生",Snackbar.LENGTH_SHORT)
                .setAction("确定",new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(lab1.this, "Snackbar的确定按钮被点击了" , Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
    public void clickjzg(View v){
        Snackbar.make(v,"您选择了教职工",Snackbar.LENGTH_SHORT)
                .setAction("确定",new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(lab1.this, "Snackbar的确定按钮被点击了" , Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public void clickdl(View v){

    }




}
