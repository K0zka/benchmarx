package com.github.K0zka.benchmarx.concat.java;

import org.openjdk.jmh.annotations.Benchmark;

public class JavaConcatBenchmark {
    public String concat2StringBackend(String name) {
        return "Hello ".concat(name);
    }
    @Benchmark
    public void concat2String() {
        concat2StringBackend("Bob");
    }

    public String concat3StringBackend(String name) {
        return "Hello ".concat(name).concat("!");
    }
    @Benchmark
    public void concat3String() {
        concat3StringBackend("Bob");
    }


    public String append2StringBackend(String name) {
        return "Hello "+(name);
    }
    @Benchmark
    public void append2String() {
        append2StringBackend("Bob");
    }

    public String append3StringBackend(String name) {
        return "Hello "+(name) + "!";
    }
    @Benchmark
    public void append3String() {
        append3StringBackend("Bob");
    }

    public String concat2IntegerBackend(Integer num) {
        return "Hello ".concat(Integer.toString(num));
    }
    @Benchmark
    public void concat2Integer() {
        concat2IntegerBackend(42);
    }

}
