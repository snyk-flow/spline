/*
 * Copyright 2019 ABSA Group Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package za.co.absa.spline.json4s.adapter

import java.text.SimpleDateFormat

import org.json4s.{DefaultFormats, Formats, TypeHints}

class FormatsAdapterImpl extends FormatsAdapter {
  override def defaultFormatsWith(
    _typeHintFieldName: String,
    _typeHints: TypeHints,
    _dateFormatter: => SimpleDateFormat): Formats = new DefaultFormats {

    override val typeHints: TypeHints = _typeHints
    override val typeHintFieldName: String = _typeHintFieldName

    override def dateFormatter: SimpleDateFormat = _dateFormatter
  }
}