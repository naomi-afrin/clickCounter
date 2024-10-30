package com.example.clickcounter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clickcounter.ui.theme.ClickCounterTheme


class MainActivity : ComponentActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // Step 2
        val btn: Button = findViewById(R.id.btn)
        val result_txt: TextView = findViewById(R.id.textView)

        // step 3 adding functionality
        btn.setOnClickListener {
            result_txt.setText(""+increaseCounter())
        }


    }

    fun increaseCounter(): Int{
        counter++
        return counter
    }
}




