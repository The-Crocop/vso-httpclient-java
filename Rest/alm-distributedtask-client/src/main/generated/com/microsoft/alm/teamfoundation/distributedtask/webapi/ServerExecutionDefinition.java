// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class ServerExecutionDefinition {

    private JobEventsConfig events;

    @JsonProperty("events")
    public JobEventsConfig getEventsConfig() {
        return events;
    }

    @JsonProperty("events")
    public void setEventsConfig(final JobEventsConfig events) {
        this.events = events;
    }
}