package kg.tutorialapp.homework_49

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startService(Intent(this, MyService::class.java))
        }
    }
}