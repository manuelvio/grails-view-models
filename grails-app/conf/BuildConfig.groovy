/*
 * Copyright 2011 Luke Daley
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
grails.project.work.dir = "target"

grails.project.dependency.resolution = {
	inherits("global")
	log "warn"
	
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
	}
	
	dependencies {}
	
	plugins {
		compile (":tomcat:$grailsVersion", ":hibernate:$grailsVersion") {
			export = false
		}
		
		test (":spock:0.5-groovy-1.7") {
			export = false
		}
	}
}
