/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.spatial4j.core.io;

import java.io.IOException;
import java.io.Writer;
import com.spatial4j.core.shape.Shape;


/**
 * Implementations are expected to be thread safe
 */
public interface ShapeWriter extends ShapeIO {

  /**
   * Write a shape to the output writer
   */
  public void write(Writer output, Shape shape) throws IOException;

  /**
   * Write a shape to String
   */
  public String toString(Shape shape);
}
