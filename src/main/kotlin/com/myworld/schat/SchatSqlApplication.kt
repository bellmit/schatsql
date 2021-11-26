package com.myworld.schat

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling


@EnableAsync
@EnableScheduling
@EnableFeignClients
@SpringCloudApplication
open class SchatSqlApplication

fun main(args: Array<String>) {
    SpringApplication.run(SchatSqlApplication::class.java, *args)
}

