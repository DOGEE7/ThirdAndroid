package cst.hqu.edu.cn.third;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ASUS on 2018/5/5.
 */

public class F5 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.f5,container,false);
        Button button=(Button)view.findViewById(R.id.bn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler(v);
            }
        });
        return view;
    }
    public  void clickHandler(View source){
        EditText txt=(EditText)getActivity().findViewById(R.id.txt);
        txt.setText("绑定到标签");
    }
}
