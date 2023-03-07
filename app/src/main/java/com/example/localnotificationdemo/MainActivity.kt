package com.example.localnotificationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.localnotificationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service = CounterNotificationService(applicationContext)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.notificationButton.setOnClickListener {
            service.showNotification(Counter.value)
        }
    }
}
