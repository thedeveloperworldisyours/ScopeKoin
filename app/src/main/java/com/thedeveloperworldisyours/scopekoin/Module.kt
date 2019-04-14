package com.thedeveloperworldisyours.scopekoin

import org.koin.core.qualifier.named
import org.koin.dsl.module

object Module {
    val appModule = module {

        // single instance of HelloRepository
        single<HelloRepository> { HelloRepositoryImpl() }

        // Scoped MyScopePresenter instance
        scope(named<MyScopeActivity>()) {
            scoped { MyScopePresenter(get()) }
        }
    }
}