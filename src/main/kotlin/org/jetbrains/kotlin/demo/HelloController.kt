package org.jetbrains.kotlin.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class HelloRequest(val status: Boolean, val result: String, val message: String? = null)

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun hello(): HelloRequest {
        return HelloRequest(status = true, result = "Hi all")
    }

}