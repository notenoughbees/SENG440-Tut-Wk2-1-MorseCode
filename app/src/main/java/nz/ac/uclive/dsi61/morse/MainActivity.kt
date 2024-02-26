package nz.ac.uclive.dsi61.morse

import android.app.Activity
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // associate the layout with the activity
        setContentView(R.layout.main)
        // reference the widgets
        val dotButton: Button = findViewById(R.id.dotButton)
        val dashButton: Button = findViewById(R.id.dashButton)

        // register callback functions for the widgets
        val toner = ToneGenerator(AudioManager.STREAM_ALARM, ToneGenerator.MAX_VOLUME)
        val dotDuration = 200
        val dashDuration = dotDuration * 3
        dotButton.setOnClickListener {
            Toast.makeText(this, "DOT!", Toast.LENGTH_LONG).show()
            toner.startTone(ToneGenerator.TONE_SUP_DIAL, dotDuration)
        }
        dashButton.setOnClickListener {
            Toast.makeText(this, "DASH!", Toast.LENGTH_LONG).show()
            toner.startTone(ToneGenerator.TONE_SUP_DIAL, dashDuration)
        }
    }




}