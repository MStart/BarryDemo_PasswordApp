package barry.demo.passwordApp;

import barry.demo.passwordApp.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class BBBActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bbb);

		findViewById(R.id.textView).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				BBBActivity.this.finish();
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
	}
}
