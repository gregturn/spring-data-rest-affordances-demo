/*
 * Copyright 2018 the original author or authors.
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
package com.greglturnquist.springdatarestaffordancesdemo;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Greg Turnquist
 */
@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Address {

	private @Id @GeneratedValue Long id;
	private String street;
	private String city;
	private String state;
	private String zip;

	Address(String street, String city, String state, String zip) {

		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}
