package q.frame.test;

import android.app.Activity;
import android.os.Bundle;
import q.frame.QActivity2;
import q.frame.QLayout;

public class LayoutLoadingA extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new QLayout.Loading(this, "连接中"));
	}
}
