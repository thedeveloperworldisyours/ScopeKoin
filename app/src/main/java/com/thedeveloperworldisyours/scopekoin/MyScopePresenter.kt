package com.thedeveloperworldisyours.scopekoin

class MyScopePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"
}