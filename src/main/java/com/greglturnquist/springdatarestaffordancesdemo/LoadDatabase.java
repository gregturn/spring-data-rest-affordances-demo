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

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Greg Turnquist
 */
@Configuration
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employees, AddressRepository addresses) {
		return args -> {
			Employee bilbo = employees.save(new Employee("Bilbo Baggins", "burglar"));
			Employee frodo = employees.save(new Employee("Frodo Baggins", "ring bearer"));

			Address address = addresses.save(new Address("132 Lyme Drive", "Clarksville", "TN", "37043"));

			bilbo.setAddress(address);
			employees.save(bilbo);

			frodo.setAddress(address);
			employees.save(frodo);
		};
	}
}
