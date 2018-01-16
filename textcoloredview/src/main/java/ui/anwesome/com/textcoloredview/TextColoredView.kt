package ui.anwesome.com.textcoloredview

/**
 * Created by anweshmishra on 16/01/18.
 */
import android.view.*
import android.content.*
import android.graphics.*
class TextColoredView(ctx:Context,var color:Int = Color.RED):View(ctx) {
    val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(canvas:Canvas) {

    }
    override fun onTouchEvent(event:MotionEvent):Boolean {
        when(event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}