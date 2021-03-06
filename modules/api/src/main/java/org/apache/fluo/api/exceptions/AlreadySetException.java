/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.fluo.api.exceptions;

import org.apache.fluo.api.data.Bytes;
import org.apache.fluo.api.data.Column;

/**
 * Thrown if {@link org.apache.fluo.api.client.Transaction#set(Bytes, Column, Bytes)} is called
 * multiple times for the same row and column
 *
 * @since 1.0.0
 */
public class AlreadySetException extends FluoException {

  private static final long serialVersionUID = 1L;

  public AlreadySetException(String msg) {
    super(msg);
  }

  public AlreadySetException() {
    super();
  }
}
