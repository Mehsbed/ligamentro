package com.surendramaran.ligamentro

import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.Random
import com.surendramaran.ligamentro.BubbleView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Create a root FrameLayout
        val rootLayout = FrameLayout(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Create the bubble view first
        val bubbleView = BubbleView(this)
        rootLayout.addView(bubbleView)

        // Create a container for buttons with a semi-transparent background
        val buttonContainer = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#80000000")) // Semi-transparent black background
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Create rounded button style
        fun createButton(text: String, color: Int): Button {
            val button = Button(this).apply {
                setText(text)
                textSize = 20f
                setTextColor(ContextCompat.getColor(context, android.R.color.white))
                
                val shape = GradientDrawable().apply {
                    shape = GradientDrawable.RECTANGLE
                    cornerRadius = 50f
                    setColor(color)
                }
                background = shape
                
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 20, 0, 20)
                    width = 600
                    height = 150
                }
            }
            return button
        }

        val translateButton = createButton("Translate", Color.parseColor("#800080")).apply {
            setOnClickListener {
                startActivity(Intent(this@HomeActivity, MainActivity::class.java))
            }
        }

        val aboutUsButton = createButton("About Project", Color.parseColor("#9370DB")).apply {
            setOnClickListener {
                startActivity(Intent(this@HomeActivity, AboutProjectActivity::class.java))
            }
        }

        buttonContainer.addView(translateButton)
        buttonContainer.addView(aboutUsButton)
        
        // Add the button container to the root layout
        rootLayout.addView(buttonContainer)
        
        setContentView(rootLayout)

        // Add fade-in animation for buttons
        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.duration = 1000
        translateButton.startAnimation(fadeIn)
        aboutUsButton.startAnimation(fadeIn)
    }
} 