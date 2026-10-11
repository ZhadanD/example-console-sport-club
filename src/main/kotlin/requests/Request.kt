package ru.sport.club.requests

import ru.sport.club.people.Client
import ru.sport.club.people.Trainer

class Request {
    var text: String = ""
    var sender: Client
    var recipient: Trainer
    var status: RequestStatusEnum = RequestStatusEnum.NOT_VIEWED

    constructor(text: String, sender: Client, recipient: Trainer) {
        this.text = text
        this.sender = sender
        this.recipient = recipient
    }
}
