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
        val state = ColoredTextState()
        fun draw(canvas:Canvas,paint:Paint) {
            paint.textSize = size
            val tw = paint.measureText(text)
            canvas.save()
            canvas.translate(x,y)
            val path = Path()
            val rect_width = (tw/2)*state.scale
            path.addRect(RectF(-rect_width,-size/2,rect_width,size/2),Path.Direction.CW)
            canvas.clipPath(path)
            paint.color = color
            canvas.drawText(text,-tw/2,0f,paint)
            canvas.restore()
        }
        fun update(stopcb:(Float)->Unit) {
            state.update(stopcb)
        }
        fun startUpdating(startcb:()->Unit) {
            state.startUpdating(startcb)
        }
    }
    data class ColoredTextState(var scale:Float = 0f,var dir:Float = 0f,var prevScale:Float = 0f) {
        fun update(stopcb:(Float)->Unit) {
            scale += 0.1f*dir
            if(Math.abs(scale - prevScale) > 1) {
                scale = prevScale + dir
                dir = 0f
                prevScale = scale
                stopcb(scale)
            }
        }
        fun startUpdating(startcb:()->Unit) {
            dir = 1-2*scale
            startcb()
        }
    }
}