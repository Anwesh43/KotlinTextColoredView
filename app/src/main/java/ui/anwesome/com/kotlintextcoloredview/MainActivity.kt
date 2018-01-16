package ui.anwesome.com.kotlintextcoloredview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ui.anwesome.com.textcoloredview.TextColoredView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextColoredView.create(this,"Hello brother")
        view.addOnTextColoredListener({
            Toast.makeText(this,"Text Colored",Toast.LENGTH_SHORT).show()
        },{
            Toast.makeText(this,"Text Colored Over",Toast.LENGTH_SHORT).show()
        })
    }
}
