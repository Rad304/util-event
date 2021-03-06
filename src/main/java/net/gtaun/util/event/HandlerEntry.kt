/**
 * Copyright (C) 2012-2016 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.util.event

/**
 * Interface of EventHandler entry that is registered.
 * Use for getting informations of handler and canceling event.
 */
interface HandlerEntry {
    /**
     * Get the related instance of EventManager.

     * @return Instance of EventManager.
     */
    val eventManager: EventManager

    /**
     * Cancel this event handling process.
     */
    fun cancel()

    /**
     * Get the event type that this entry registered.

     * @return Event
     */
    val type: Class<out Event>

    val attentions: Attentions

    /**
     * Get the instance of EventHandler.

     * @return Instance of EventHandler
     */
    val handler: EventHandler<*>

    /**
     * Get the priority of EventHandler.

     * @return Priority
     */
    val priority: Short
}