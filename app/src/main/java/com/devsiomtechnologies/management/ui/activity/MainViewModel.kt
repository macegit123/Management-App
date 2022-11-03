package com.devsiomtechnologies.management.ui.activity

import androidx.hilt.lifecycle.ViewModelInject
import com.devsiomtechnologies.management.baseclasses.BaseViewModel
import com.devsiomtechnologies.management.data.remote.reporitory.MainRepository
import com.devsiomtechnologies.management.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : BaseViewModel() {


}
