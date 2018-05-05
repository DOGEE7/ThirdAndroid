package cst.hqu.edu.cn.third;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ASUS on 2018/5/5.
 */

public class SendSmsListener implements View.OnClickListener {
    private EditText editText;
    public SendSmsListener(EditText editText) {
        super();
        this.editText=editText;
    }

    @Override
    public void onClick(View v) {
        editText.setText("我是外部类");
    }
}
