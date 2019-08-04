package com.search2source.mvp_project.presenter

import com.search2source.mvp_project.model.User

class AnotherPresenter(private val anotherView: AnotherView) {
    private lateinit var userInput: User

    init {
        this.userInput = User()
    }

    fun updateText(changeText : String){
        userInput.name = changeText
        anotherView.writeTV(userInput.name)
    }

    interface AnotherView {
        fun writeTV(input: String)
    }
}