
/**
 * Created by IntelliJ IDEA.
 * User: djpate
 * Date: 16/06/11
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
class Gravatar {

    static url = { String email, configName='default' ->

        String emailHash = email.toLowerCase().encodeAsMD5()

        config = configs[configName]

        String url = "http://www.Gravatar.com/avatar/$emailHash?s=${config['size']}&d=${config.imageset}&r=${config.rating}"



        return url

    }

    static configs = [
        default: [
            size: 80,
            imageset: 'mm',
            rating: 'g'
        ]
    ]

}
