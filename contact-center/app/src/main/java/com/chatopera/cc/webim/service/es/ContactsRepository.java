/*
 * Copyright (C) 2017 优客服-多渠道客服系统
 * Modifications copyright (C) 2018 Chatopera Inc, <https://www.chatopera.com>
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
package com.chatopera.cc.webim.service.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.chatopera.cc.webim.web.model.Contacts;

import java.util.List;

public interface ContactsRepository extends  ElasticsearchRepository<Contacts, String> , ContactsEsCommonRepository {
	public int countByDatastatusIsFalseAndPhoneAndOrgi(String phone,String orgi);
	public List<Contacts> findOneByDatastatusIsFalseAndPhoneAndOrgi(String phone, String orgi);
}
