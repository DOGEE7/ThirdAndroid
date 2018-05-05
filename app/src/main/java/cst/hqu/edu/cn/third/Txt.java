package cst.hqu.edu.cn.third;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Txt extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.txt);
        super.onCreate(savedInstanceState);
        Button button = (Button)findViewById(R.id.bnreturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Txt.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
