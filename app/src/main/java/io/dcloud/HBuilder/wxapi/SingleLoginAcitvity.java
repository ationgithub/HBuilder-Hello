package io.dcloud.HBuilder.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.dcloud.HBuilder.R;

public class SingleLoginAcitvity extends Activity{
    Button button;

    boolean aorb = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlelogin_layout);
        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aorb){
                Intent it = new Intent();
                it.setAction("my_action");
                it.addCategory("my_category");
                startActivity(it);
                }else {
                    Intent i = new Intent(getApplicationContext(),SDK_WebView.class);    //注意，此处名字必须与java文件完全一致。
                    startActivity(i);
                }
            }
        });

    }

    void initListen(){
        Toast.makeText(getApplicationContext(),"dd",Toast.LENGTH_SHORT).show();
    }

}
