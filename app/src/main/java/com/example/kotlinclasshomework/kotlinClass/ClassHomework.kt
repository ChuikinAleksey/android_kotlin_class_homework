package com.example.kotlinclasshomework.kotlinClass

/**
 * ДЗ:
 * Добавьте еще один класс, который будет наследоваться от класса Employee. Это может быть класс с названием вашей любимой профессии.
 * Переопределите методы haveLunch() и goHome() для своего класса. Пусть описание в этих методах соответствует вашему представлению об этой профессии.
 *
 * После этого создай объект своего класса в методе main(), как мы это делали на уроке с другими классами и вызови у него методы goHome и haveLunch.
 * Посмотри, что будет выведено в терминал
 */
class Profession: Employee () {
    override fun haveLunch() {
        println("You don't have lunch")
    }
    override fun goHome() {
        println("You can go home early")
    }
}     
fun main() {
    val obj = Profession()
    obj.haveLunch()
    obj.goHome()
    // TODO здесь нужно создать объект своего класса и вызывать у него методы haveLunch() и goHome()
}
