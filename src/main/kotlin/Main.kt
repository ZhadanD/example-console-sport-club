package ru.sport.club

import ru.sport.club.people.Trainer
import ru.sport.club.services.Admin
import ru.sport.club.services.SportClub
import ru.sport.club.subscriptions.Subscription

fun main() {
    var subscriptions: MutableList <Subscription> = mutableListOf(
        Subscription("silver", "Standart subscription", 2500),
        Subscription( "gold", "more features subscription", 5000),
        Subscription("premium", "for the majors", 10000)
    )

    var trainers: MutableList<Trainer> = mutableListOf(
        Trainer(
            "Roma",
            45,
            mutableListOf(),
            "Roma",
            "qwerty"
        )
    )

    var admins: MutableList<Admin> = mutableListOf(
        Admin("admin", "admin123")
    )

    println("1. admin\n 2. user")
    var d = readln()

    if (d == "1") {
        var admin: Admin = Admin()
        admin.goAdmin(subscriptions, admins)
    } else {
        var sportClub: SportClub = SportClub()
        sportClub.go(subscriptions, trainers)
    }
}
