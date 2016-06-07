package kr.hs.emirim.beee1004.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butText = (Button)findViewById(R.id.but_text);
        butText.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is message part.");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}
