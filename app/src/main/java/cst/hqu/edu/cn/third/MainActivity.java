package cst.hqu.edu.cn.third;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txt = (EditText)findViewById(R.id.txt);
        //实现内部类
        Button bn1 = (Button)findViewById(R.id.bn1);
        bn1.setOnClickListener(new MyClickListener());

        //实现外部类
        Button bn2 = (Button)findViewById(R.id.bn2);
        bn2.setOnClickListener(new SendSmsListener(txt));
        //实现匿名内部类
        Button bn3 = (Button)findViewById(R.id.bn3);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("我是匿名内部类");
            }
        });
        //直接使用activity作为事件监听器
        Button bn4 = (Button)findViewById(R.id.bn4);
        bn4.setOnClickListener(this);

        Button bnleft = (Button)findViewById(R.id.bnleft);
        bnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CallbackHandler.class);
                startActivity(intent);
            }
        });
        Button bnright = (Button)findViewById(R.id.bnright);
        bnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ConfigurationTest.class);
                startActivity(intent);
            }
        });
        Button bnfinall = (Button)findViewById(R.id.bnfinall);
        bnfinall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProgressDialogTest.class);
                startActivity(intent);
            }
        });


    }
    //定义一个单击事件的监听器
    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            EditText txt = (EditText)findViewById(R.id.txt);
            txt.setText("内部类");
        }
    }
    //实现activity本身作为监听器类,实现事件处理方法
    @Override
    public void onClick(View v) {
       EditText txt =(EditText)findViewById(R.id.txt);
       txt.setText("Activity");
    }
    //绑定到标签

}
