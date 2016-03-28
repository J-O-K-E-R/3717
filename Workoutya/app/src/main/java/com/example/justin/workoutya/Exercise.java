package com.example.justin.workoutya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.Serializable;

public class Exercise extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,Serializable {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    private Intent exerciseIntent = getIntent();
    private String id = null;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);
        exerciseIntent = getIntent();
        if(exerciseIntent != null){
            String val = exerciseIntent.getStringExtra("listName");
            if(val != null){
                setId(val);
            }
        }


    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        String id = getId();
        if (!wasRestored) {
            switch(id){
                case "Push Up": player.cueVideo("tccdbY5xcf4"); // Plays https://www.youtube.com/watch?v=tccdbY5xcf4
                    break;
                case "Sit Up": player.cueVideo("wFElbNOzzrA"); // Plays https://www.youtube.com/watch?v=wFElbNOzzrA
                    break;
                case "Pull Up": player.cueVideo("CdtrfXK7bcg"); // Plays https://www.youtube.com/watch?v=CdtrfXK7bcg
                    break;
                case "Squat": player.cueVideo("t2b8UdqmlFs"); // Plays https://www.youtube.com/watch?v=t2b8UdqmlFs
                    break;
                case "Barbell": player.cueVideo("oUqgPSZmhro"); // Plays https://www.youtube.com/watch?v=oUqgPSZmhro
                    break;
                case "Dead Lift": player.cueVideo("d5eGGZXb0Is"); // Plays https://www.youtube.com/watch?v=d5eGGZXb0Is
                    break;
                case "Bench Press": player.cueVideo("esQi683XR44"); // Plays https://www.youtube.com/watch?v=esQi683XR44
                    break;
                default: player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
            }

        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }


}
