/*
 * smart-doc https://github.com/shalousun/smart-doc
 *
 * Copyright (C) 2018-2023 smart-doc
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.smartdoc.gradle.util;

import java.util.ResourceBundle;

/**
 * I18nMessagesUtil
 *
 * @author 冰凝
 * 2023-03-14 00:11
 */
public interface I18nMsgUtil {
    ResourceBundle LOG_MESSAGE = ResourceBundle.getBundle("LogPromptMessages");

    /**
     * Abbreviations, instead of full writing: 👇
     */
    @SuppressWarnings("JavadocDeclaration")
    static String get(String key) {
        return LOG_MESSAGE.getString(key);
    }

}
