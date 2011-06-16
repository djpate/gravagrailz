import javax.security.auth.login.Configuration
import org.codehaus.groovy.grails.commons.ConfigurationHolder
/**
 * Created by IntelliJ IDEA.
 * User: djpate
 * Date: 16/06/11
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
class Gravatar {

    static url = { String email, configName='default' ->
        def config = []
        config.putAll(defaultConfig)
        config.putAll(ConfigurationHolder.config.gravagrails.configs[configName] as HashMap)
        String emailHash = email.toLowerCase().encodeAsMD5()
        String url = "http://www.Gravatar.com/avatar/$emailHash?s=${config['size']}&d=${config.imageset}&r=${config.rating}"
        return url

    }

    static defaultConfig = [ size: 80, imageset: 'mm', rating: 'g' ]

}
