package uk.co.jakelee.splashscreendemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        sleep(3000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
