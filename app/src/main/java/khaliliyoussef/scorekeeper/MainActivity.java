package khaliliyoussef.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    //team one
    @BindView(R.id.buttonTeamOneAddFoul) Button buttonTeamOneAddFoul;
    @BindView(R.id.buttonTeamOneAddPoint) Button buttonTeamOneAddPoint;
    @BindView(R.id.textViewTeamOneScore) TextView ScoreTeamOne;
    @BindView(R.id.textViewTeamOneFoulNumber) TextView textViewTeamOneFoul;

    //team two
    @BindView(R.id.buttonTeamTwoAddPoint) Button buttonTeamTwoAddPoint;
    @BindView(R.id.buttonTeamTwoAddFoul) Button buttonTeamTwoAddFoul;
    @BindView(R.id.textViewTeamTwoScore) TextView ScoreTeamTwo;
    @BindView(R.id.textViewTeamTwoFoulNumber) TextView textViewTeamTwoFoul;

    //rest button
    @BindView(R.id.buttonReset) Button buttonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
