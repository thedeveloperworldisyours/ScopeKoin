package com.thedeveloperworldisyours.scopekoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.scope.currentScope

class MyScopeActivity : AppCompatActivity() {

    // inject MyScopePresenter from current scope
    val scopePresenter: MyScopePresenter by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get_bn.setOnClickListener {
            hello_text.text = scopePresenter.sayHello()
        }
    }
}
