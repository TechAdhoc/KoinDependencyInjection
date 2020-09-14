package com.techadhoc.koindependencyinjection

import android.util.Log
import androidx.lifecycle.ViewModel
import com.techadhoc.koindependencyinjection.repository.RepositoryInterface

class MainViewModel(private val repo:RepositoryInterface):  ViewModel() {

    fun printMsg(){
        Log.d("Hello:",repo.giveHello())
    }

}