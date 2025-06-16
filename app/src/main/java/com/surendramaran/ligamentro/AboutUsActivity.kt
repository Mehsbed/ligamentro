package com.surendramaran.ligamentro

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.Random
import com.surendramaran.ligamentro.BubbleView

class AboutProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootLayout = FrameLayout(this)

        // Main vertical layout for text content
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }

        // Rounded-corner background box
        val boxLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            val boxParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            boxParams.setMargins(48, 120, 48, 120)
            layoutParams = boxParams
            background = GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                cornerRadius = 48f
                setColor(Color.parseColor("#AA1A0033")) // semi-transparent purple
            }
            setPadding(48, 48, 48, 48)
        }

        // Add project title
        val titleText = TextView(this).apply {
            text = "About Project"
            textSize = 32f
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 32)
            }
        }

        // Add project description
        val descriptionText = TextView(this).apply {
            text = "This Android application leverages advanced computer vision technology to provide real-time object detection capabilities. Built using TensorFlow Lite and YOLOv8, it offers efficient and accurate object recognition through the device's camera. The app demonstrates the practical implementation of machine learning in mobile applications, showcasing the potential of on-device AI processing."
            textSize = 16f
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 32)
            }
        }

        // Add creator section
        val creatorTitle = TextView(this).apply {
            text = "Created By"
            textSize = 24f
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val creatorInfo = TextView(this).apply {
            text = "Mehank\nVellore Institute of Technology, Bhopal\nB.Tech in CSE (Cybersecurity and Digital Forensics)\nmehank7214@gmail.com"
            textSize = 18f
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        boxLayout.addView(titleText)
        boxLayout.addView(descriptionText)
        boxLayout.addView(creatorTitle)
        boxLayout.addView(creatorInfo)
        mainLayout.addView(boxLayout)

        // Add background animation with bubbles
        val bubbleView = BubbleView(this)
        rootLayout.addView(bubbleView)
        rootLayout.addView(mainLayout)

        setContentView(rootLayout)
    }
} 