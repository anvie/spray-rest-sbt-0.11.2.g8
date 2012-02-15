package com.$organization$.$packageName$.response

case class ErrorResponse(version: Long, request: String, errors: List[String]) extends Response(version, request)