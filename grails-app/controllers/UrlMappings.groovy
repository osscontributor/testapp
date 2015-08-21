


class UrlMappings {

    static mappings = {
        String apiName = getGrailsApplication().config.getProperty('info.app.name')
        String apiVersion = getGrailsApplication().config.getProperty('info.app.version')
        String entrypoint = (apiName)?"${apiName}_v${apiVersion}":"v${apiVersion}"

        "/$entrypoint/$controller/$action?/$id?(.$format)?"{
            parseRequest = true
        }

        // BAD Mapping, will fail test. Maps to everything effectively. Not a bug
        "/*/$controller/$action?/$id?(.$format)?"{
            parseRequest = true
        }

    }
}
