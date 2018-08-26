package benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 3)
@Measurement(iterations = 3)
public class StackTraceBenchmark {
    @Benchmark
    public void BenchmarkStackTrace() {
        Thread.currentThread().getStackTrace();
    }
}
