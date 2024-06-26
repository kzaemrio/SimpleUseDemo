package me.kz

import javax.ws.rs.GET
import javax.ws.rs.Path

/*
* Copyright (c) 2010, 2019 Oracle and/or its affiliates. All rights reserved.
*
* This program and the accompanying materials are made available under the
* terms of the Eclipse Distribution License v. 1.0, which is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* SPDX-License-Identifier: BSD-3-Clause
*/

/**
 *
 * @author Jakub Podlesak
 */
@Path(HelloWorldResource.PATH)
class HelloWorldResource {
        @GET
        fun hello(): String = "hello world"

        companion object {
                const val PATH = "HelloWorld"
        }
}
