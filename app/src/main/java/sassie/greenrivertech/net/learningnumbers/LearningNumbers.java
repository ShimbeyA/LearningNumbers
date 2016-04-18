package sassie.greenrivertech.net.learningnumbers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class LearningNumbers extends AppCompatActivity {

    private LearningNumbersModel model = new LearningNumbersModel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_numbers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                               .setAction("Action", null).show();
                                   }
                               });


                model.generateNumber();

                Button b1 = (Button) findViewById(R.id.button1);
                b1.setText("" + model.getButton1());

                Button b2 = (Button) findViewById(R.id.button2);
                b2.setText("" + model.getButton2());

                Button score = (Button) findViewById(R.id.score);
                score.setText("" + model.getGamesPlayed());

                Button won = (Button) findViewById(R.id.won);
                won.setText("" + model.getGamesWon());


            }


            public void handleButton1Click(View view) {
                boolean result = model.play(LearningNumbersModel.LeftFirst);

                if (result == true) {
                    showToastMessage("got it");
                } else {
                    showToastMessage("not right");
                }
                model.getButton1();
                model.getButton2();
                model.generateNumber();

                Button b1 = (Button) findViewById(R.id.button1);
                b1.setText("" + model.getButton1());

                Button b2 = (Button) findViewById(R.id.button2);
                b2.setText("" + model.getButton2());

                Button score = (Button) findViewById(R.id.score);
                score.setText("" + model.getGamesPlayed());

                Button won = (Button) findViewById(R.id.won);
                won.setText("" + model.getGamesWon());


            }

            public void handleButton2Click(View view) {
                boolean result = model.play(LearningNumbersModel.LeftSecond);

                if (result == true) {
                    showToastMessage("Correct answer");
                } else {
                    showToastMessage("Wrong answer");
                }
                model.getButton1();
                model.getButton2();
                model.generateNumber();

                Button b1 = (Button) findViewById(R.id.button1);
                b1.setText("" + model.getButton1());

                Button b2 = (Button) findViewById(R.id.button2);
                b2.setText("" + model.getButton2());

                Button score = (Button) findViewById(R.id.score);
                score.setText("" + model.getGamesPlayed());

                Button won = (Button) findViewById(R.id.won);
                won.setText("" + model.getGamesWon());
            }


            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_learning_numbers, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }

                return super.onOptionsItemSelected(item);
            }

            public void showToastMessage(String message) {
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
                toast.show();
            }
        }

