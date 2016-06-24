/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
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

package org.wso2.carbon.andes.rest.tests;

/**
 * Common constants use through out the test for rest service.
 */
public class Constants {
    public static final String HOSTNAME = "localhost";
    public static final int PORT = 7777;
    public static final String VERSION = "v1.0.0";
    public static final String ROOT_PATH = "/mb/" + VERSION;
    public static final String BASE_URL = "http://" + HOSTNAME + ":" + PORT + ROOT_PATH;

}
