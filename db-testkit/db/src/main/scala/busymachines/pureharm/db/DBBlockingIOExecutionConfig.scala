/**
  * Copyright (c) 2019 BusyMachines
  *
  * See company homepage at: https://www.busymachines.com/
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package busymachines.pureharm.db

/**
  *
  * For now we only expose one single configuration,
  * in future versions we'll provide more configurable,
  * and type-safe DSL, so you don't accidentally shoot yourself
  * in the foot by providing a possibly dead-locking config.
  *
  * @param queueSize
  * @param maxConnections
  * @author Lorand Szakacs, https://github.com/lorandszakacs
  * @since 02 Apr 2019
  */
final case class DBBlockingIOExecutionConfig(
  prefixName:     String,
  queueSize:      Int,
  maxConnections: Int,
)

object DBBlockingIOExecutionConfig {

  def default: DBBlockingIOExecutionConfig = DBBlockingIOExecutionConfig(
    prefixName     = "pureharm-db",
    queueSize      = 2000,
    maxConnections = 20,
  )
}
