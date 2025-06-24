# spring-kafka-partial-batch

1. update your kafka connection configs in KafkaConsumer.java class.

2. Issue Logs

{"timestamp":"2025-06-24T17:45:10.135477Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: 50f0b8f4-53bb-4ba4-a14d-6c091649e35c, Offset: 77296746, Partition: 23"}
{"timestamp":"2025-06-24T17:45:10.13577Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: 50f0b8f4-53bb-4ba4-a14d-6c091649e35c, Offset: 77296747, Partition: 23"}
{"timestamp":"2025-06-24T17:45:10.135838Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: 50f0b8f4-53bb-4ba4-a14d-6c091649e35c, Offset: 77296748, Partition: 23"}

{"timestamp":"2025-06-24T17:45:10.1372Z","logger_name":"o.s.k.l.KafkaMessageListenerContainer","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Committing: {test-topic-23=OffsetAndMetadata{offset=77296747, leaderEpoch=null, metadata=''}}"}


{"timestamp":"2025-06-24T17:45:17.670316Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: fef85434-9002-4301-ae75-8c9cd8281143, Offset: 77296749, Partition: 23"}
{"timestamp":"2025-06-24T17:45:17.670505Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: fef85434-9002-4301-ae75-8c9cd8281143, Offset: 77296750, Partition: 23"}
{"timestamp":"2025-06-24T17:45:17.670566Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: fef85434-9002-4301-ae75-8c9cd8281143, Offset: 77296751, Partition: 23"}

{"timestamp":"2025-06-24T17:45:17.670761Z","logger_name":"o.s.k.l.KafkaMessageListenerContainer","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Committing: {test-topic-23=OffsetAndMetadata{offset=77296750, leaderEpoch=null, metadata=''}}"}

{"timestamp":"2025-06-24T17:45:23.601222Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: e44a03ba-62a5-453a-86f8-ed3e03715b0b, Offset: 77296752, Partition: 23"}
{"timestamp":"2025-06-24T17:45:23.601753Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: e44a03ba-62a5-453a-86f8-ed3e03715b0b, Offset: 77296753, Partition: 23"}
{"timestamp":"2025-06-24T17:45:23.601848Z","logger_name":"c.s.e.t.BatchManualModeListener","thread_name":"test_listener-0-C-1","level":"INFO","serviceArchPath":"NA","process":"NA","message":"Message Received with BatchId: e44a03ba-62a5-453a-86f8-ed3e03715b0b, Offset: 77296754, Partition: 23"}
