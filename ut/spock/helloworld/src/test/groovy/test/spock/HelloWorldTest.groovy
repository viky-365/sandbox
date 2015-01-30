package test.spock

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by vikrant on 19/01/15.
 */
class HelloWorldTest extends Specification{
    def "hello world"(){
        expect:
            Math.max(2,3) == 3
    }

    //@Unroll
    def "data table #c should be max between #a and #b"(){
        expect:
        Math.max(a,b) == c

        where:
        a  | b  || c
        1  | 2  || 2
        10 | 20 || 20
        20 | 30 || 20
        30 | 40 || 40
    }

    def "given when then"(){
        given:
        def a=10

        when:
        def b=a*10

        then:
        b == 100
    }
}
