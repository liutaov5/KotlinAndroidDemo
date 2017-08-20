package com.liutao.demo.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.liutao.demo.R
import com.liutao.demo.model.HelloBean
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{
    private val helloBean: HelloBean = HelloBean("1234", "liutao", 12)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var hello = findViewById<TextView>(R.id.tv_hello)
//        hello.setOnClickListener {
//            helloBean.printMessage()
//            Toast.makeText(this,helloBean.printMessage(),Toast.LENGTH_SHORT).show()
//            Toast.makeText(this,helloBean.compare(3),Toast.LENGTH_SHORT).show()
//        }
        tv_hello.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_hello -> {
                Toast.makeText(this,helloBean.printMessage(),Toast.LENGTH_SHORT).show()
                Toast.makeText(this,helloBean.compare(3),Toast.LENGTH_SHORT).show()
            }

        }
    }
}
