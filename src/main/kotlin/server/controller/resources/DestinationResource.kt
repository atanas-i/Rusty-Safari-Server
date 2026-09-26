package server.controller.resources

import io.ktor.resources.Resource
import javax.print.attribute.standard.Destination

@Resource("/destinations")
class Destinations {
    @Resource("/{id}")
    class Id(val parent: Destinations = Destinations(), val id: Long)
}