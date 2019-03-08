# Execute multiple commands by redis-cli
We can use `redis-cli` to connect redis sever and execute command. Today I want to execute multiple commands. After connecting
redis server I copy multiple commands and paste them in `redis-cli`. I got error message. My commands are like following.

```
SADD my_key "my_value1"
SADD my_key "my_value2"
SADD my_key "my_value3"
SADD my_key "my_value4"
SADD my_key "my_value5"
SADD my_key "my_value6"
```

The solution is here. Copying all commands into a new file. Let's say this file named `my_commands.txt`. Using following
command to execute all commands in the file.

```
src/redis-cli -h <your_home> -p <your_port> < /tmp/my_commands.txt
```

EOF