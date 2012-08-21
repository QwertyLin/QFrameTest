package q.frame.test;

import q.frame.QActivity2;
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

public class MainA extends QActivity2 {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, QFrameActionBarA.class));
        finish();
    }
}
