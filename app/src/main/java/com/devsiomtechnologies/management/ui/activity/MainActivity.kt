package com.devsiomtechnologies.management.ui.activity

import android.os.Bundle
import android.view.View
import com.devsiomtechnologies.management.BR
import com.devsiomtechnologies.management.R
import com.devsiomtechnologies.management.baseclasses.BaseActivity
import com.devsiomtechnologies.management.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: Class<MainViewModel>
        get() = MainViewModel::class.java

    override val layoutId: Int
        get() = R.layout.activity_main

    override val bindingVariable: Int
        get() = BR.viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialising()

    }

    private fun initialising() {

    }

    open fun showProgressBar() {
        mViewDataBinding.progressBar.visibility = View.VISIBLE
    }

    open fun hideProgressBar() {
        mViewDataBinding.progressBar.visibility = View.GONE
    }

}