package kr.hs.emirim.beee1004.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] items={"젤리빈","킷켓","롤리팝","마쉬멜로"};
    boolean[] checkArr={false,true,false,true};
    Button butText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butText = (Button)findViewById(R.id.but_text);
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

        /*
        dialog.setItems(items, new Dia
        * */
        dialog.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                butText.setText(items[which]);
            }
        });

        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "대화상자의 확인 버튼을 클릭했어용~", Toast.LENGTH_LONG).show();
            }
        });
        dialog.show();
    }
}
