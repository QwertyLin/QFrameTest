package q.frame.test;

import q.frame.QActivity;
import q.frame.QDialog;
import q.util.QApp;
import q.util.QLog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainA extends QActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context ctx = this;
        QApp qApp = (QApp)getApplicationContext();
        //
        setContentView(R.layout.main);
        setTitle("Test");
        addBtnBack("返回");
        addBtn("Test", false);
        //
        
        //
        LinearLayout layout = (LinearLayout)findViewById(R.id.test_layout);
        //
        Button btn;
        btn = new Button(this);
        btn.setText("dialog.simple");
        btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				QDialog.Simple d = new QDialog.Simple(ctx, "dialog.simple");
				d.addBtnGotIt();
				d.show();
			}
		});
        layout.addView(btn);
        //
        btn = new Button(this);
        btn.setText("dialog.loading");
        btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				QDialog.Loading d = new QDialog.Loading(ctx);
				d.show();
			}
		});
        layout.addView(btn);
        //
        btn = new Button(this);
        btn.setText("layout.loading");
        btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ctx, LayoutLoadingA.class));
			}
		});
        layout.addView(btn);
        
    }
}
