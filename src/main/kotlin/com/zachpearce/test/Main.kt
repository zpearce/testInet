package com.zachpearce.test

import java.net.InetAddress
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main(args: Array<String>) {
    val host = args[0]
    val duration = measureTime {
        val ip = InetAddress.getByName(host)
        println("ip is $ip")
    }
    println("Resolved $host in $duration")
}
