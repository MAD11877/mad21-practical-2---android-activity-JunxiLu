package sg.edu.np.mad.junxiprac2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user student1 = new user("Junxi Lu",
                "Second year IT student at Ngee Ann Polytechnic",
                10219098,
                false);

        TextView nameTxt = findViewById(R.id.nameTxt);
        nameTxt.setText(student1.name);

        TextView descTxt = findViewById(R.id.descTxt);
        descTxt.setText(student1.description);

        Button followBtn = findViewById(R.id.followBtn);
        if (student1.followed){
            followBtn.setText(R.string.unfollow);
        } else {
            followBtn.setText(R.string.follow);
        }

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button followBtn = findViewById(R.id.followBtn);
                if (student1.followed){
                    followBtn.setText(R.string.follow);
                    Toast toast= Toast.makeText(MainActivity.this,"Followed",Toast.LENGTH_SHORT);
                } else {
                    followBtn.setText(R.string.unfollow);
                }

                //Update followed status accordingly
                student1.followed = !student1.followed;
            }
        });
    }
}