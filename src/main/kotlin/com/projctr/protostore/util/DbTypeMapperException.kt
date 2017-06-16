package com.projctr.protostore.util

class DbTypeMapperException : Throwable {
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(cause: Throwable) : super(cause)
    constructor(message: String?, cause: Throwable) : super(message, cause)
}