// Sys

__config() -> {
   'scope' -> 'global',
   'commands' -> {
		'' -> 'print_info'
	},
    'command_permission' -> 1
};

pprint(msg) -> (
    print(player(), msg);
);

s(prop) -> system_info(prop);

print_info() -> (
    pprint('');
    pprint(format('w 世界名称：', 'l ' + s('world_name'), 'w    种子：[', 'l ' + s('world_seed'), '&' + s('world_seed'), '^w 点击以复制', 'w ]'));
    pprint('');
    pprint(format('w JVM 版本：', 'y Java ' + s('java_version') + ' x' + s('java_bits'), 'w     可用 CPU 数量：', 'y ' + s('java_cpu_count')));
    pprint('');
    pprint(format('w CPU 占用：', 'c ' + round(s('java_process_cpu_load')) + '%', '^w JVM 占用量', 'w /', 'c ' + round(s('java_system_cpu_load')) + '%', '^w 总占用量', 'w    JVM 内存分配：', 'c ' + round(s('java_used_memory')/1048576) + 'M', '^w 使用量', 'w /', 'c ' + round(s('java_allocated_memory')/1048576) + 'M', '^w 分配量', 'w /', 'c ' + round(s('java_max_memory')/1048576) + 'M', '^w 最大可用量'));
    pprint('');
    ltt = s('server_last_tick_times');
    pprint(format('w 最后三 Tick 执行时间：', 'y ' + ltt:0, 'w , ', 'y ' + ltt:1, 'w , ', 'y ' + ltt:2));
    pprint('')
);
