# redis benchmark
Benchmarking Redis is very easy. After completing the redis installation, there is a command tool in his directory to 
perform benchmark tests. Here is a simple example.
```
[root@virtual redis-5.0.8]# src/redis-benchmark -n 100000 -q -d 100
PING_INLINE: 50327.12 requests per second
PING_BULK: 49751.24 requests per second
SET: 48123.20 requests per second
GET: 49333.99 requests per second
INCR: 49480.46 requests per second
LPUSH: 48239.27 requests per second
RPUSH: 47393.37 requests per second
LPOP: 40733.20 requests per second
RPOP: 43859.65 requests per second
SADD: 41084.63 requests per second
HSET: 42808.22 requests per second
SPOP: 41271.15 requests per second
LPUSH (needed to benchmark LRANGE): 36258.16 requests per second
LRANGE_100 (first 100 elements): 21691.97 requests per second
LRANGE_300 (first 300 elements): 9373.83 requests per second
LRANGE_500 (first 450 elements): 5464.18 requests per second
LRANGE_600 (first 600 elements): 4966.48 requests per second
MSET (10 keys): 42808.22 requests per second
```
I benchmark redis on a virtual machine. My virtual machine configuration is 2 core cpu, 4G of memory.

From the output above, we can see that a single instance of redis can easily reach a qps of about 50,000.

EOF