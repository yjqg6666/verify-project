1. change the agent path in run.sh file.
2. maven build the project by "mvn package"
3. run run.sh script.
4. curl "http://localhost:8080/logger/1"
5. the console will output the log without TxId & SpanId.