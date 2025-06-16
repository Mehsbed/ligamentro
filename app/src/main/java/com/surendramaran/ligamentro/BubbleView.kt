package com.surendramaran.ligamentro

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Handler
import android.os.Looper
import android.view.View
import java.util.Random

class BubbleView(context: Context) : View(context) {
    private val bubbles = mutableListOf<Bubble>()
    private val random = Random()
    private val paint = Paint().apply {
        color = Color.parseColor("#E6E6FA") // Light purple shade
        alpha = 100
    }
    private val handler = Handler(Looper.getMainLooper())
    private val updateRunnable = object : Runnable {
        override fun run() {
            updateBubbles()
            invalidate()
            handler.postDelayed(this, 10) // Increased from 16ms to 10ms for faster updates
        }
    }

    init {
        // Create initial bubbles
        repeat(20) {
            bubbles.add(createBubble())
        }
        handler.post(updateRunnable)
    }

    private fun createBubble(): Bubble {
        return Bubble(
            x = random.nextFloat() * width,
            y = random.nextFloat() * height,
            radius = random.nextFloat() * 20 + 10,
            speedX = random.nextFloat() * 4 - 2, // Increased speed range from 2 to 4
            speedY = random.nextFloat() * 4 - 2  // Increased speed range from 2 to 4
        )
    }

    private fun updateBubbles() {
        bubbles.forEach { bubble ->
            bubble.x += bubble.speedX
            bubble.y += bubble.speedY
            if (bubble.x < 0 || bubble.x > width) bubble.speedX *= -1
            if (bubble.y < 0 || bubble.y > height) bubble.speedY *= -1
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        bubbles.forEach { bubble ->
            canvas.drawCircle(bubble.x, bubble.y, bubble.radius, paint)
        }
    }

    data class Bubble(var x: Float, var y: Float, val radius: Float, var speedX: Float, var speedY: Float)
} 