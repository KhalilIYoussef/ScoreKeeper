package khaliliyoussef.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    Team t1;
    Team t2;
    //team one
    @BindView(R.id.buttonTeamOneAddFoul)
    Button buttonTeamOneAddFoul;
    @BindView(R.id.buttonTeamOneAddPoint)
    Button buttonTeamOneAddPoint;
    @BindView(R.id.textViewTeamOneScore)
    TextView scoreTeamOne;
    @BindView(R.id.textViewTeamOneFoulNumber)
    TextView textViewTeamOneFoul;

    //team two
    @BindView(R.id.buttonTeamTwoAddPoint)
    Button buttonTeamTwoAddPoint;
    @BindView(R.id.buttonTeamTwoAddFoul)
    Button buttonTeamTwoAddFoul;
    @BindView(R.id.textViewTeamTwoScore)
    TextView scoreTeamTwo;
    @BindView(R.id.textViewTeamTwoFoulNumber)
    TextView textViewTeamTwoFoul;

    //rest button
    @BindView(R.id.buttonReset)
    Button buttonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        t1 = new Team("one", 0, 0);
        t2 = new Team("two", 0, 0);

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //team one
                t1.setFoul(0);
                t1.setScore(0);

                //team two
                t2.setFoul(0);
                t2.setScore(0);

            }
        });

        buttonTeamOneAddFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int faul=t1.getFoul()+1;
                t1.setFoul(faul);
                textViewTeamOneFoul.setText(String.valueOf(faul));
            }
        });

        buttonTeamTwoAddFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int foul=t2.getFoul()+1;
                t2.setFoul(foul);
                textViewTeamTwoFoul.setText(String.valueOf(foul));
            }
        });

        buttonTeamOneAddPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=t1.getScore()+1;
                t1.setScore(score);
                scoreTeamOne.setText(String.valueOf(score));
            }
        });

        buttonTeamTwoAddPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int score=t2.getScore()+1;
                t2.setScore(score);
                scoreTeamTwo.setText(String.valueOf(score));

            }
        });
    }
}
