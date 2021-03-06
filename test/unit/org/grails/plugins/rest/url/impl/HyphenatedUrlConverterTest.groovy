package org.grails.plugins.rest.url.impl;

import static org.junit.Assert.*;

import org.grails.plugins.rest.url.UrlConverter;
import org.junit.Test;

class HyphenatedUrlConverterTest {
	@Test
	void 'will convert URL with hyphens to camelCase'() {
		// given
		UrlConverter converter = new HyphenatedUrlConverter()

		// when
		def actual = converter.convert('/first-person/1/rock-and-roll/2/rules')

		// then
		assert actual == '/firstPerson/1/rockAndRoll/2/rules'
	}
}
