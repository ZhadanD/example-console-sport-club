package ru.sport.club.people

import ru.sport.club.requests.Request

class Trainer: Person {
    var clients: MutableList<Client>
    var requests: MutableList<Request> = mutableListOf()
    var login: String = ""
    var password: String = ""

    constructor(name: String, age: Int, clients: MutableList<Client>, login: String, password: String) : super(name, age) {
        this.clients = clients
        this.login = login
        this.password = password
    }
}
