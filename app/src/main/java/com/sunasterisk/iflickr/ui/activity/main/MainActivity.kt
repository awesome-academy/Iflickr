package com.sunasterisk.iflickr.ui.activity.main

import android.content.Context
import android.content.Intent
import com.sunasterisk.iflickr.R
import com.sunasterisk.iflickr.base.BaseActivity

class MainActivity : BaseActivity() {

    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun initView() {

    }

    override fun initData() {

    }

    override fun initViewModel() {

    }

    override fun observerData() {

    }

    companion object {

        fun getIntent(context: Context): Intent =
            Intent(context, MainActivity::class.java)
    }
}
