package com.gyasilarbi.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clear_text.setOnClickListener {
            input.text = ""
            output.text = ""
        }

        open_bracket_left.setOnClickListener {
            input.text = addToInputText("(")
        }

        open_bracket_right.setOnClickListener {
            input.text = addToInputText(")")
        }

        button_0.setOnClickListener {
            input.text = addToInputText("0")
        }

        button_1.setOnClickListener {
            input.text = addToInputText("1")
        }

        button_2.setOnClickListener {
            input.text = addToInputText("2")
        }

        button_3.setOnClickListener {
            input.text = addToInputText("3")
        }

        button_4.setOnClickListener {
            input.text = addToInputText("4")
        }

        button_5.setOnClickListener {
            input.text = addToInputText("5")
        }

        button_6.setOnClickListener {
            input.text = addToInputText("6")
        }

        button_7.setOnClickListener {
            input.text = addToInputText("7")
        }

        button_8.setOnClickListener {
            input.text = addToInputText("8")
        }

        button_9.setOnClickListener {
            input.text = addToInputText("9")
        }

    }

    private fun addToInputText(buttonValue: String): String{
        return "${input.text}$buttonValue"
    }
}