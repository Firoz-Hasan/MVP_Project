package com.search2source.mvp_project.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.search2source.mvp_project.R
import com.search2source.mvp_project.presenter.AnotherPresenter
import com.search2source.mvp_project.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityPresenter.View , AnotherPresenter.AnotherView{
    override fun writeTV(input: String) {
        textView?.setText(input)
    }

    override fun updateUserInfoTextView(info: String) {
        textView?.setText(info)
    }

    private var presenter: MainActivityPresenter? = null
    private var anotherPresenter : AnotherPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)
        anotherPresenter = AnotherPresenter(this)

        button.setOnClickListener {
            presenter!!.updateFullName("Main presenter")
        }
        button2.setOnClickListener {
            anotherPresenter?.updateText("another presenter")
        }
    }
}
