package barry.demo.passwordApp;

import android.app.Activity;
import android.content.Intent;

public class BaseActivity extends Activity {

	MyApplication myApplaction;

	protected void onResume() {
		super.onResume();
		myApplaction = (MyApplication) getApplication();
		if (myApplaction.isLocked) {//�ж��Ƿ���Ҫ��ת���������
			Intent intent = new Intent(this, PasswordActivity.class);
			startActivity(intent);
		}
	};
//git ���Լ���Ч��
}
