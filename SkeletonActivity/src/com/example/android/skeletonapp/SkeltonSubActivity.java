package com.example.android.skeletonapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SkeltonSubActivity extends Activity {
    String str;

    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	// ��ʂ� XML ���w�肷��
	setContentView(R.layout.skelton_sub_activity);

	if ((savedInstanceState == null) || (savedInstanceState.isEmpty())) {
	    // �C���e���g����ǉ��f�[�^�����o��
	    str = getIntent().getExtras().getString("INTENT_PARAM");
	} else
	    str = "";

	// �ҏW�G���A�ɒǉ��f�[�^��\������B
	TextView edit = (TextView) findViewById(R.id.textView1);
	edit.setText(str);
    }
}
