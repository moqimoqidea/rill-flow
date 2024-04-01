--redis_lock.lua
local val = redis.call("get", KEYS[1]);
if not val or val == ARGV[1] then
    redis.call("set", KEYS[1], ARGV[1]);
else
    return "FAIL"
end
