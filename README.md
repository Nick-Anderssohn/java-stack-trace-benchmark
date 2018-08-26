# java-stack-trace-benchmark
Benchmark results on my desktop with Intel® Core™ i7-6700 CPU @ 3.40GHz × 8 running Ubuntu 18.04.1 LTS
```
# JMH version: 1.19
# VM version: JDK 1.8.0_181, VM 25.181-b13
# VM invoker: /usr/lib/jvm/java-8-oracle/jre/bin/java
# VM options: -javaagent:/home/nick/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/182.3911.36/lib/idea_rt.jar=34225:/home/nick/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/182.3911.36/bin -Dfile.encoding=UTF-8
# Warmup: 6 iterations, 1 s each
# Measurement: 3 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.StackTraceBenchmark.BenchmarkStackTrace

# Run progress: 0.00% complete, ETA 00:01:30
# Fork: 1 of 10
# Warmup Iteration   1: 9928.727 ns/op
# Warmup Iteration   2: 9241.397 ns/op
# Warmup Iteration   3: 9215.694 ns/op
# Warmup Iteration   4: 9132.943 ns/op
# Warmup Iteration   5: 9194.549 ns/op
# Warmup Iteration   6: 9210.567 ns/op
Iteration   1: 9175.028 ns/op
Iteration   2: 9221.644 ns/op
Iteration   3: 9307.216 ns/op

# Run progress: 10.00% complete, ETA 00:01:27
# Fork: 2 of 10
# Warmup Iteration   1: 9798.582 ns/op
# Warmup Iteration   2: 9543.420 ns/op
# Warmup Iteration   3: 9544.001 ns/op
# Warmup Iteration   4: 9472.981 ns/op
# Warmup Iteration   5: 9551.229 ns/op
# Warmup Iteration   6: 9539.408 ns/op
Iteration   1: 9518.623 ns/op
Iteration   2: 9515.396 ns/op
Iteration   3: 9611.085 ns/op

# Run progress: 20.00% complete, ETA 00:01:16
# Fork: 3 of 10
# Warmup Iteration   1: 9477.641 ns/op
# Warmup Iteration   2: 9198.873 ns/op
# Warmup Iteration   3: 9467.905 ns/op
# Warmup Iteration   4: 9860.697 ns/op
# Warmup Iteration   5: 10326.662 ns/op
# Warmup Iteration   6: 9173.526 ns/op
Iteration   1: 9175.156 ns/op
Iteration   2: 9233.741 ns/op
Iteration   3: 9230.325 ns/op

# Run progress: 30.00% complete, ETA 00:01:07
# Fork: 4 of 10
# Warmup Iteration   1: 9398.791 ns/op
# Warmup Iteration   2: 9032.187 ns/op
# Warmup Iteration   3: 9012.482 ns/op
# Warmup Iteration   4: 9074.559 ns/op
# Warmup Iteration   5: 9101.067 ns/op
# Warmup Iteration   6: 8977.517 ns/op
Iteration   1: 8997.782 ns/op
Iteration   2: 9028.328 ns/op
Iteration   3: 9070.564 ns/op

# Run progress: 40.00% complete, ETA 00:00:57
# Fork: 5 of 10
# Warmup Iteration   1: 9348.457 ns/op
# Warmup Iteration   2: 9050.700 ns/op
# Warmup Iteration   3: 8993.182 ns/op
# Warmup Iteration   4: 8975.728 ns/op
# Warmup Iteration   5: 9067.574 ns/op
# Warmup Iteration   6: 8981.583 ns/op
Iteration   1: 8955.362 ns/op
Iteration   2: 9034.934 ns/op
Iteration   3: 9012.556 ns/op

# Run progress: 50.00% complete, ETA 00:00:47
# Fork: 6 of 10
# Warmup Iteration   1: 9900.149 ns/op
# Warmup Iteration   2: 9709.440 ns/op
# Warmup Iteration   3: 9703.027 ns/op
# Warmup Iteration   4: 9624.461 ns/op
# Warmup Iteration   5: 9570.216 ns/op
# Warmup Iteration   6: 9552.485 ns/op
Iteration   1: 9564.700 ns/op
Iteration   2: 9489.200 ns/op
Iteration   3: 9610.564 ns/op

# Run progress: 60.00% complete, ETA 00:00:38
# Fork: 7 of 10
# Warmup Iteration   1: 9275.568 ns/op
# Warmup Iteration   2: 9048.215 ns/op
# Warmup Iteration   3: 9060.850 ns/op
# Warmup Iteration   4: 8963.600 ns/op
# Warmup Iteration   5: 9057.561 ns/op
# Warmup Iteration   6: 9038.203 ns/op
Iteration   1: 8993.639 ns/op
Iteration   2: 9082.402 ns/op
Iteration   3: 9060.914 ns/op

# Run progress: 70.00% complete, ETA 00:00:28
# Fork: 8 of 10
# Warmup Iteration   1: 9249.690 ns/op
# Warmup Iteration   2: 9107.553 ns/op
# Warmup Iteration   3: 9061.966 ns/op
# Warmup Iteration   4: 9027.112 ns/op
# Warmup Iteration   5: 9090.041 ns/op
# Warmup Iteration   6: 9071.240 ns/op
Iteration   1: 9045.872 ns/op
Iteration   2: 9031.322 ns/op
Iteration   3: 9014.392 ns/op

# Run progress: 80.00% complete, ETA 00:00:19
# Fork: 9 of 10
# Warmup Iteration   1: 9543.165 ns/op
# Warmup Iteration   2: 9287.746 ns/op
# Warmup Iteration   3: 9292.138 ns/op
# Warmup Iteration   4: 9279.071 ns/op
# Warmup Iteration   5: 9256.076 ns/op
# Warmup Iteration   6: 9205.422 ns/op
Iteration   1: 9226.863 ns/op
Iteration   2: 9207.320 ns/op
Iteration   3: 9240.697 ns/op

# Run progress: 90.00% complete, ETA 00:00:09
# Fork: 10 of 10
# Warmup Iteration   1: 9429.291 ns/op
# Warmup Iteration   2: 9103.637 ns/op
# Warmup Iteration   3: 9125.307 ns/op
# Warmup Iteration   4: 9152.575 ns/op
# Warmup Iteration   5: 9151.436 ns/op
# Warmup Iteration   6: 9055.636 ns/op
Iteration   1: 9124.092 ns/op
Iteration   2: 9076.729 ns/op
Iteration   3: 9077.641 ns/op


Result "benchmark.StackTraceBenchmark.BenchmarkStackTrace":
  9197.803 ±(99.9%) 134.794 ns/op [Average]
  (min, avg, max) = (8955.362, 9197.803, 9611.085), stdev = 201.754
  CI (99.9%): [9063.009, 9332.597] (assumes normal distribution)


# Run complete. Total time: 00:01:35

Benchmark                                Mode  Cnt     Score     Error  Units
StackTraceBenchmark.BenchmarkStackTrace  avgt   30  9197.803 ± 134.794  ns/op
```
