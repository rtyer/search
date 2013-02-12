/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.solr.hadoop.tika;

import org.apache.solr.hadoop.Utils;

public enum TikaCounters {

  FILES_READ (getClassName(TikaMapper.class) + ": Number of files read"),

  FILE_BYTES_READ (getClassName(TikaMapper.class) + ": Number of file bytes read"),

  DOCS_READ (getClassName(TikaMapper.class) + ": Number of documents read"),

  PARSER_OUTPUT_BYTES (getClassName(TikaMapper.class) + ": Number of document bytes generated by Tika parser"),

  ERRORS (getClassName(TikaMapper.class) + ": Number of errors");

  private final String label;
  
  private TikaCounters(String label) {
    this.label = label;
  }
  
  public String toString() {
    return label;
  }
  
  private static String getClassName(Class clazz) {
    return Utils.getShortClassName(clazz);
  }

}
