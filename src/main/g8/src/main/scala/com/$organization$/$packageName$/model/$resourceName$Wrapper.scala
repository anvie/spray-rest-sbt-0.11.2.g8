package com.$organization$.$packageName$.model

import com.novus.salat.annotations.raw.{Ignore, Salat}
import org.bson.types.ObjectId

case class $resourceName$Wrapper(_id: Option[ObjectId],
                                       version: Long,
                                       content: List[$resourceName$])