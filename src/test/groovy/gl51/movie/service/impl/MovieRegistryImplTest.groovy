package gl51.movie.service.impl

import gl51.movie.service.MovieClient
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {
    @Inject MovieRegistryImpl registry
    @Inject MovieClientImpl client

    void "injection should work"() {
        expect:
        registry != null
    }

    void "favorites should be empty"() {
        expect:
        registry.listFavorites() == []
    }

    void "adding a facovite should fill in the database"() {
        when:
        registry.addMovieToFavorites("abcde")
        then:
        registry.listFavorites().size() == 1
        client.getMovieDetail("abcde")!=null
        client.getMovieDetail("aaaa") == null
    }
    @MockBean(MovieClientImpl)
    MovieClient client() {
        Mock(MovieClient)
    }
}
