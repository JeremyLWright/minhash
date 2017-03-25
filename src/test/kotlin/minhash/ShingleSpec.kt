package minhash

import org.jetbrains.annotations.TestOnly
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object ShingleSpec : Spek({
    describe("Shingling sentences of various width") {
        on("shingling 3") {
            it("should split the sentence into sets of three")
            {
                assertEquals(2, minhash.firstFun())
            }

        }
    }
})