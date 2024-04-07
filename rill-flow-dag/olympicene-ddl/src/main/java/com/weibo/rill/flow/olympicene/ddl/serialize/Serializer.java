/*
 *  Copyright 2021-2023 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.rill.flow.olympicene.ddl.serialize;

import com.weibo.rill.flow.olympicene.core.exception.SerializationException;

import java.nio.charset.StandardCharsets;

public interface Serializer {

    byte[] serialize(Object object) throws SerializationException;

    <T> T deserialize(byte[] bytes, Class<T> type) throws SerializationException;

    default String serializeToString(Object object) throws SerializationException {
        // FIXME: Code Completion From Here.
        return result == null ? null : new String(result, StandardCharsets.UTF_8);
    }
}
