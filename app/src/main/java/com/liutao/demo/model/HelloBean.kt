package com.liutao.demo.model

/**
 * Created by liutao on 2017/8/13.
 */
class HelloBean(var id: String) {

    var name: String? = null
    var age: Int = 0
    var b: Boolean? = false

    constructor (id: String, name: String, age: Int) : this(id) {
        this.name = name
        this.age=age
    }

    internal fun printMessage(): String {
        return id + name
    }

    fun compare(number: Int?): String {
        if (number == null) {
            return "number is null"
        }
        if (age > number) {
            return "age>number"
        } else {
            return "age<=number"
        }
    }
}