package ui.anwesome.com.kotlintextcoloredview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ui.anwesome.com.textcoloredview.TextColoredView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TextColoredView.create(this,"Hello brother")
    }
}
