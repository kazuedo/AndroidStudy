package com.example.android.skeletonapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SkeltonSubActivity extends Activity {
    String str;

    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	// 画面の XML を指定する
	setContentView(R.layout.skelton_sub_activity);

	if ((savedInstanceState == null) || (savedInstanceState.isEmpty())) {
	    // インテントから追加データを取り出す
	    str = getIntent().getExtras().getString("INTENT_PARAM");
	} else
	    str = "";

	// 編集エリアに追加データを表示する。
	TextView edit = (TextView) findViewById(R.id.textView1);
	edit.setText(str);
    }
}
