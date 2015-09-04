/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'gsus' at '04/09/15 17.09' with Gradle 2.6
 *
 * @author gsus, @date 04/09/15 17.09
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
