package app.takumi.obayashi.count_check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            number++
            CountLabelText.text = number.toString()
        }

        minusButton.setOnClickListener {
            number--
            CountLabelText.text = number.toString()
        }
    }
}
