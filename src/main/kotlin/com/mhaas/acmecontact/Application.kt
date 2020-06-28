package com.mhaas.acmecontact

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.mhaas.acmecontact")
        .start()
}
