package com.github.gajo4256

import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Specification

/**
 * Created by Tomislav Gajsak on 29/02/16.
 */
@Narrative("""
This is some narrative code
in multiple
lines
""")
class SimpleTest extends Specification {

    @Issue("http://www.example.org")
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 4
        "Kirk"   | 4
        "Scotty" | 6
    }


}
