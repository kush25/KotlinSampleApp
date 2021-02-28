package com.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    submit_button.setOnClickListener{
            val result_intent = Intent(this,Result::class.java)
            if (editText.text !=null){

                val display_text = editText.text
                result_intent.putExtra("text",display_text.toString())
                startActivity(result_intent)
                println(display_text)




            }



    }

    }


}