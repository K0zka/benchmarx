package com.github.K0zka.benchmarx.concat.kotlin

import org.openjdk.jmh.annotations.Benchmark

open class KotlinConcatBenchmark {
	fun formatString2Backend(name : String) : String {
		return "Hello ${name}"
	}
	Benchmark fun formatString2() {
		formatString2Backend("bob")
	}

	fun formatString3Backend(name : String) : String {
		return "Hello ${name} !"
	}
	Benchmark fun formatString3() {
		formatString2Backend("bob")
	}

	fun plusString2Backend(name : String) : String {
		return "Hello ".plus(name)
	}
	Benchmark fun plusString2() {
		plusString2Backend("bob")
	}

	fun plusInt2Backend(num : Int) : String {
		return "Hello ".plus(num)
	}
	Benchmark fun plusInt2() {
		plusInt2Backend(42)
	}

	fun plusInt3Backend(num : Int) : String {
		return "Hello ".plus(num).plus("!")
	}
	Benchmark fun plusInt3() {
		plusInt2Backend(42)
	}

}
