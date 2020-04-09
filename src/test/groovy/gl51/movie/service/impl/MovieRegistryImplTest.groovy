package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {
    @Inject
    MovieRegistryImpl registry

    @Inject
    MovieClientImpl movieClient

   /* @Inject
    MovieClient movieClientMock = Mock()*/

    void "injection should work"() {
        expect:
        registry != null
        //movieClientMock != null
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
        //movieClient.getMovieDetail("abcde")!=null
        //movieClient.getMovieDetail("aaadea") == null
    }

    /*@MockBean(MovieClientImpl)
    MovieClient client() {
        def mock = Mock(movieClient)
        mock.getM

        Mock(MovieClient)
    }*/

    @MockBean(MovieClientImpl)
    MovieClient movieClient() {
        def mock = Mock(MovieClient)
        mock.getMovieDetail("aaaaa") >> new Movie(imdbID: "aaaaa", title: 'my movie')
        mock
    }
}
