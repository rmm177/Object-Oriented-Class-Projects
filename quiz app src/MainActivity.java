package rhettmartin.cs3354.txstate.edu.GoTV2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import rhettmartin.cs3354.txstate.edu.gameofthronesq1.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button true_button;
    private Button false_button;
    private int currentIndex = 0;
    private ArrayList <Question> questionBank;
    private void initialize () {
        questionBank = new ArrayList<Question>();
        questionBank.add (new Question(R.string.q1, false));
        questionBank.add (new Question(R.string.q2, false));
        questionBank.add (new Question(R.string.q3, true));
        questionBank.add (new Question(R.string.q4, false));
        questionBank.add (new Question(R.string.q5, true));
        questionBank.add (new Question(R.string.q6, false));
        questionBank.add (new Question(R.string.q7, true));
        questionBank.add (new Question(R.string.q8, false));
        questionBank.add (new Question(R.string.q9, true));
        questionBank.add (new Question(R.string.q10, false));
        questionBank.add (new Question(R.string.q11, true));
        questionBank.add (new Question(R.string.q12, false));
        questionBank.add (new Question(R.string.q13, false));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        textView   = (TextView) findViewById(R.id.question_id);
        textView.setText(questionBank.get(0).getQuestion());

        textView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                currentIndex = (currentIndex + 1) % questionBank.size();
                updateQuestion();
            }
        });

        true_button = (Button) findViewById(R.id.true_button);

        true_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                checkAnswer(true);
            }
        });

        false_button = (Button) findViewById(R.id.false_button);

        false_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                checkAnswer(false);
            }
        });
    }
    private void checkAnswer (boolean userPressedButton) {
        if (questionBank.get(currentIndex).isTrueQuestion() == userPressedButton) {
            Toast.makeText (MainActivity.this, R.string.correct_toast,
                    Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            Toast.makeText (MainActivity.this, R.string.incorrect_toast,
                    Toast.LENGTH_SHORT).show();
            return;
        }
    }
    private void updateQuestion() {
        int question = questionBank.get(currentIndex).getQuestion();
        textView.setText(question);
    }



}
