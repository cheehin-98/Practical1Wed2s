package com.example.practical1wed2s
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        val dicerolled: TextView = findViewById(R.id.dice_rolled)

        val resultText1: TextView = findViewById(R.id.result_text1)
        val randomInt1 = Random().nextInt(6) + 1

        val resultText2: TextView = findViewById(R.id.result_text2)
        val randomInt2 = Random().nextInt( 6) + 1
        val total: TextView = findViewById(R.id.total)

        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()

        dicerolled.text = "Dice Rolled Successfully"
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        total.text = "Total: "+(randomInt + randomInt1 + randomInt2).toString()

    }




}
