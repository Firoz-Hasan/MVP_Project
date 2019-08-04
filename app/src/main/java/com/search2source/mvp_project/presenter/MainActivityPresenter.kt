package com.search2source.mvp_project.presenter

import com.search2source.mvp_project.model.User


class MainActivityPresenter(private val view: View) {

    private val user: User

    init {
        this.user = User()
    }

    fun updateFullName(fullName: String) {
        user.name = fullName
        view.updateUserInfoTextView(user.name)

    }

    interface View {
        fun updateUserInfoTextView(info: String)
    }
}
