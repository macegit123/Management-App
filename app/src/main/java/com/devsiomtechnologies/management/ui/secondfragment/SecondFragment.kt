package com.devsiomtechnologies.management.ui.secondfragment

import com.devsiomtechnologies.management.BR
import com.devsiomtechnologies.management.R
import com.devsiomtechnologies.management.baseclasses.BaseFragment
import com.devsiomtechnologies.management.databinding.LayoutSecondBinding

class SecondFragment : BaseFragment<LayoutSecondBinding, SecondViewModel>() {

    override val layoutId: Int
        get() = R.layout.layout_second
    override val viewModel: Class<SecondViewModel>
        get() = SecondViewModel::class.java
    override val bindingVariable: Int
        get() = BR.viewModel
}