package com.techadhoc.koindependencyinjection.repository

interface RepositoryInterface {
    fun giveHello(): String
}

class Repository() : RepositoryInterface {
    override fun giveHello() = "Hello Koin"
}