package ui.anwesome.com.textcoloredview

/**
 * Created by anweshmishra on 16/01/18.
 */
import android.view.*
import android.content.*
import android.graphics.*
class TextColoredView(ctx:Context,var text:String,var color:Int = Color.RED):View(ctx) {
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
    data class ColoredText(var text:String,var color:Int,var x:Float,var y:Float,var size:Float) {
        fun draw(canvas:Canvas,paint:Paint) {
            paint.textSize = size
            val tw = paint.measureText(text)
            canvas.save()
            canvas.translate(x,y)
            val path = Path()
            path.addRect(RectF(-tw/2,-size/2,tw/2,size/2),Path.Direction.CW)
            canvas.clipPath(path)
            paint.color = color
            canvas.drawText(text,-tw/2,0f,paint)
            canvas.restore()
        }
        fun update(stopcb:(Float)->Unit) {

        }
        fun startUpdating(startcb:()->Unit) {

        }
    }
}