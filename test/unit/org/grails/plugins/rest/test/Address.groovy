package org.grails.plugins.rest.test

import grails.persistence.Entity

@Entity
class Address {
	Long id
	City city
	String street
}
