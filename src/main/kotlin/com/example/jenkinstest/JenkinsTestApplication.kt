package com.example.jenkinstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JenkinsTestApplication

fun main(args: Array<String>) {
    runApplication<JenkinsTestApplication>(*args)
}
