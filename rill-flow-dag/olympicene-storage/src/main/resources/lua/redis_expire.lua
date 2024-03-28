--redis_expire.lua
redis.call("expire", KEYS[1], ARGV[1]);

if (not KEYS[2])
then
    return "OK";
end
local redisKey = redis.call("hvals", KEYS[2]);
for index = 1, #redisKey, 1 do
    -- FIXME: Code Completion From Here.
end
redis.call("expire", KEYS[2], ARGV[1]);
return "OK";
