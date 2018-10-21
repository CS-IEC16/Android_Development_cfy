package bjfu.it.cfy.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends Activity {
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if (savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("running", running);
    }


    // Start the stopwatch running when the Start button is clicked
    public void onClickStart(View view){
        running = true;
    }

    // Start the stopwatch running when the Stop button is clicked
    public void onClickStop(View view){
        running = false;
    }

    // Start the stopwatch running when the Reset button is clicked
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    /*class MyRunable implements Runnable{
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        @Override
        public void run(){
            int hours = seconds/3600;
            int minutes = (seconds%3600)/60;
            int secs = seconds%60;
            String time = String.format("%d:%02d:%02d", hours, minutes, secs);
            timeView.setText(time);
            if(running){
                seconds++;
            }
            handler.postDelayed(this, 1000);
        }
    }*/

    private void runTimer(){
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();

        /*class MyRunable implements Runnable{
            @Override
            public void run() {

            }
        }
        handler.post(new MyRunable());

        handler.post(new Runnable() {
            @Override
            public void run() {
           }
    });*/



        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });



    }
}
