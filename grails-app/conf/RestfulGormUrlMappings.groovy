// Grails < 2.4 import org.codehaus.groovy.grails.commons.ConfigurationHolder
import grails.util.Holders
@SuppressWarnings("deprecation")
class RestfulUrlUrlMappings {
	static mappings = {
		def config = ConfigurationHolder.config.grails.'restful-gorm'
		def root = config.root ?: '/api'

		"${root}/**"(controller: 'restfulGorm', action: 'index')
	}
}
