package q.frame.test;

import android.os.Bundle;
import q.frame.QActivity;
import q.frame.QLayout;

public class LayoutLoadingA extends QActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new QLayout.Loading(this, "连接中"));
	}
}
