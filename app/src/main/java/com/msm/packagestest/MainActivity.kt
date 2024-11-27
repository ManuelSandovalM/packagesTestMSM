package com.msm.packagestest

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.msm.mylibrarytest.SendGreetings

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button

    private lateinit var sendingGreetings: SendGreetings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sendingGreetings = SendGreetings(this)

        myButton = findViewById(R.id.startButton)

        myButton.setOnClickListener {
            sendingGreetings.sayHelloToast("Saludos desde el SDK")
        }

    }
}