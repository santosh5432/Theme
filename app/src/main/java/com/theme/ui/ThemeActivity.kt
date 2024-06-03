package com.theme.ui

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode
import com.theme.R


class ThemeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_theme)

        val radioGroup: RadioGroup = findViewById(R.id.idRGgroup)
        val themeTV: TextView = findViewById(R.id.idtvTheme)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->

            when (checkedId) {
                R.id.rbLight -> {
                    // changing the theme to light mode.
                    setDefaultNightMode(MODE_NIGHT_NO)
                    themeTV.text = "Light Theme"
                }

                R.id.rbDark -> {
                    // changing the theme to dark mode.
                    setDefaultNightMode(MODE_NIGHT_YES)
                    themeTV.text = "Dark Theme"
                }

                R.id.rbDefault -> {
                    // changing the theme to default theme.
                    setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                    themeTV.text = "Default Theme"
                }
            }
        }

    }
}