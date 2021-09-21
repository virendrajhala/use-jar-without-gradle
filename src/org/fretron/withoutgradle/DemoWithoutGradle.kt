package org.fretron.withoutgradle
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.*
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class User(val id: Int,
                val firstName: String,
                val password: String,
                val lastName: String){

    private val mapper : ObjectMapper

    init{
        mapper = jacksonObjectMapper()
    }

    override fun toString(): String {

        val userJson = mapper.writeValueAsString(this)
        return userJson
    }
}

fun main(){

    val user = User(100,"Virendra","vPSJ@123","jhala")
    println(user)

    val jsonString = """{
    "id":101,
    "firstName":"Mark",
    "password":"Admin123",
    "lastName":"Sheran"
    }"""

    val userList = mutableListOf<User>()
    userList.add(User(101,"Raj","1234@f","Nayak"))
    userList.add(User(102,"Vipul","76hg@54","Goyal"))
    userList.add(User(103,"Naman","pu34fg","Markande"))

    val mapper = jacksonObjectMapper()
    val jsonString1 = mapper.writeValueAsString(userList)
    println(jsonString1)
}