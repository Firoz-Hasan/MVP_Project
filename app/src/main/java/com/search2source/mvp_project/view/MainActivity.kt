package com.search2source.mvp_project.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.search2source.mvp_project.R
import com.search2source.mvp_project.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityPresenter.View {
    override fun updateUserInfoTextView(info: String) {
        textView?.setText(info)
    }

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)

        button.setOnClickListener {
            presenter!!.updateFullName("kaylash")
        }
    }
}
