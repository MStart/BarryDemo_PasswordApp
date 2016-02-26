package barry.demo.passwordApp;

import android.app.Activity;
import android.content.Intent;

public class BaseActivity extends Activity {

	MyApplication myApplaction;

	protected void onResume() {
		super.onResume();
		myApplaction = (MyApplication) getApplication();
		if (myApplaction.isLocked) {//判断是否需要跳转到密码界面
			Intent intent = new Intent(this, PasswordActivity.class);
			startActivity(intent);
		}
	};
//git 测试检验效果
}
