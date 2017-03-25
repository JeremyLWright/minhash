package minhash

import org.jetbrains.annotations.TestOnly
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
//import kotlin.test.assertEquals

object SimpleSpec : Spek({
    describe("hello") {
        on("Nothing") {
            it("should explode in a rain of nuclear death.")
            {
                println("I Got"+minhash.firstFun())
                assert(1 == minhash.firstFun())
            }

        }
    }
})
