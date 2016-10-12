/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bao.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.bao.service.ThroneService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ThroneServiceImpl implements ThroneService {

    @Override
    public String gameOfThrone(String name) {
        log.info("i like game of throne");
        System.out.println("i like game of throne");
        return "i like game of throne";
    }
}