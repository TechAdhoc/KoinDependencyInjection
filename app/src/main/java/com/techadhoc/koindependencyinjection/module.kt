package com.techadhoc.koindependencyinjection

import com.techadhoc.koindependencyinjection.repository.Repository
import com.techadhoc.koindependencyinjection.repository.RepositoryInterface
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

@JvmField
val appModule = module {
    // single instance of Repository
    single<RepositoryInterface> { Repository() }

    // Simple class
    // by inject()
    // factory {  }

    // Simple viewmodel Factory
    // use by viewModel() to inject
    viewModel { MainViewModel(get()) }
}