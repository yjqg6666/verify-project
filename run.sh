#!/usr/bin/env bash
java -javaagent:/private/tmp/agent/pinpoint-bootstrap-1.9.0-SNAPSHOT.jar \
-Dpinpoint.applicationName=test-project -Dpinpoint.agentId=testAsyncLogger \
-DLog4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector \
-Dlog4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector \
-jar target/try.jar


