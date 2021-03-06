package com.github.imliar.getstream.client

import com.typesafe.config.Config

/**
 * Bindings container
 */
trait Bindings {

  val httpClient: HttpClient
  val config: Config
  val serializer: GetStreamSerializer
  val signer: GetStreamSign

}
